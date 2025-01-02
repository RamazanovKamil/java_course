package tatar.companiese.kamil.java2025.exceptions;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        String response = getResponse("https://postman-echo.com/get?foo1=Hello&foo2=World"); //ссылка на ресурс postman-echo.com для проверки получения ответа и отправки http-запросов. Ответ возвращается в формате json.
        System.out.println(response);
    }
    //Конфигурируем HttpClient:
    public static String getResponse(String url){
        //Создаем URI - Uniform Resource Identifier:
        URI uri = URI.create(url); //в методе create происходит обработка исключения URISyntaxException.
        //Создаем HttpRequest с помощью паттерна Builder:
        HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build(); //вся эта цепочка методов возвращает объект  HttpRequest на основе входного параметра метода url.
        HttpClient client = HttpClient.newHttpClient();
        String responseBody = null;
        try{
            responseBody = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        } catch(IOException e){
            System.out.println("Here's we have IOException");
            //throw new SomeCustomException("Here's we have IOException");
        }
        catch (InterruptedException e) {
            System.out.println("Here's we have InterruptedException");
            //throw new SomeCustomException("Here's we have InterruptedException");
        }
        return responseBody;
    }
}
