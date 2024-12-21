package com.kamilrr.java.git;

import java.util.ArrayList;

public class LeetCode9 {
    public static void main(String[] args) {
        boolean isNumAPalindrome = isPalindromeSecondSolution(456654);
        System.out.println(isNumAPalindrome);
    }
    static boolean isPalindrome(int x){
        boolean res = false;
        if (x < 0){
            res = false;
        } else {
            int count = 0;
            String innerX = String.valueOf(x);;
            StringBuilder newX = new StringBuilder();
            while(x != 0){
                count++;
                newX.append(x % 10);
                x = x / 10;
            }
            String finalX = newX.toString();
            System.out.println("Quantity of numbers in inner int = " + count + ". Reverse int = " + finalX);

            if(finalX.equals(innerX)){
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }
    static boolean isPalindromeSecondSolution(int x){
        if(x < 0) return false;
        int inputX = x;
        int reversedX = 0;
        int reminder = 0;
        while(x != 0){
            reminder = x % 10;
            reversedX = reversedX * 10 + reminder;
            x = x / 10;
        }
        if(reversedX == inputX) {
            return true;
        } else {
            return false;
        }
    }
}
