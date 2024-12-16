package com.kamilrr.java.git;

import java.util.Scanner;

class StartContinueExample {
    public static void main(String[] args) {
        ContinueExample.printAllCharactersExceptOne("Thi@s st@atemen@t is @full o@f unus@ed 'a@t' sym@bol@s.", '@');
        BreakExample.breakCycleExecuting();
    }
}
public class ContinueExample {
    static void printAllCharactersExceptOne(String statement, char ignoredSymbol){
        char[] symbolsArray = statement.toCharArray();
        for(char symbol : symbolsArray){
            if(symbol == '@'){
                continue;
            } else {
                System.out.print(symbol + "");
            }
        }
    }
}
class BreakExample {
    static void breakCycleExecuting(){
        Scanner scan = new Scanner(System.in);
        while(true){
            String stopWord = scan.nextLine();
            if(stopWord.equals("q") || stopWord.equals("exit")){
                System.out.println("This cycle was stopped, because you wrote word: " + stopWord);
                break;
            }
        }
    }
}