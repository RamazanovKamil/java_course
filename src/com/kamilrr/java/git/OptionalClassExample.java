package com.kamilrr.java.git;

import java.util.Optional;

class StartOCE{
    public static void main(String[] args) {
        OptionalClassExample.handleNullPointerException();
    }
}

public class OptionalClassExample {
    static void handleNullPointerException(){
        String name = null;
        Optional.ofNullable(name).ifPresentOrElse(System.out::println, () -> System.out.println("This field has a null value"));

        //Пример обработки NullPointerException в реальных проектах:
        String result = Optional.ofNullable(name).map(String::toUpperCase).orElse("This field has a null value");
    }
}
