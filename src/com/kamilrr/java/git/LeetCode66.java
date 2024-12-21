package com.kamilrr.java.git;

public class LeetCode66 {
    public static void main(String[] args) {
        int[] outputArray = plusOne(new int[]{9,9,9,9,1});
        for(int i : outputArray){
            System.out.print(i + " ");
        }
    }
    public static int[] plusOne(int[] digits){
        int sumOfDigits = 0;
        for(int i : digits){
            sumOfDigits = sumOfDigits * 10 + i;
        }
        int sumOfDigitsIncrement = sumOfDigits + 1;
        System.out.println("sumOfDigitsIncrement = " + sumOfDigitsIncrement);
        System.out.println(sumOfDigits);
        int[] outputArray;
        if(sumOfDigits % 9 == 0){
            outputArray = new int[digits.length + 1];
            for(int i = outputArray.length - 1; i >= 0; i--){
                outputArray[i] = sumOfDigitsIncrement % 10;
                sumOfDigitsIncrement = sumOfDigitsIncrement / 10;
            }
        } else {
            outputArray = new int[digits.length];
            for(int i = outputArray.length - 1; i >= 0; i--){
                outputArray[i] = sumOfDigitsIncrement % 10;
                sumOfDigitsIncrement = sumOfDigitsIncrement / 10;
            }
        }
        return outputArray;
    }
}
