package com.kamilrr.java.git;

public class CountSymbolsExample {
    public static void main(String[] args) {
        String text = "This is an example sentence for task";
        int[] resAlph = getCountOfLetters(text);
        char targetLetter = 'X';
        int countLetter = resAlph[targetLetter-'A'];
        System.out.println(targetLetter + " letter meets " + countLetter + " times.");
    }
    static int[] getCountOfLetters(String text){
        int[] alphabet = new int[26];
        String word = text.replaceAll(" ", "").toUpperCase();
        char[] symbols = word.toCharArray();
        for(int i = 0; i < symbols.length; i++){
            alphabet[symbols[i]-'A'] += 1;
        }
        for(int i = 0; i < alphabet.length; i++){
            System.out.print((char)(i + 'A') + "-" + alphabet[i] + " ");
        }
        System.out.println();
        return alphabet;
    }
}
