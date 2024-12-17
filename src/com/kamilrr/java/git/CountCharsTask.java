package com.kamilrr.java.git;

import java.util.ArrayList;
import java.util.List;

public class CountCharsTask {
    public static void main(String[] args) {
        String text = "HELLOWORLD";
        getLettersCount(text);
    }
    static void getLettersCount(String text){
        int[] countOfСoincidences = new int[26];
        for(int i = 0; i < text.length(); i++){
            char symbol = text.charAt(i);
            countOfСoincidences[((int)symbol-'A')] += 1;
            System.out.print(symbol + "=" + ((int)symbol-'A') + " ");
        }
        System.out.println();
        for(int i = 0; i < countOfСoincidences.length; i++){
            System.out.print(((char)(i+'A')) + "=" + countOfСoincidences[i] + " ");
        }
    }
}