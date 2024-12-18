package com.kamilrr.java.git;

public class LeetCode9 {
    public static void main(String[] args) {
        boolean isNumAPalindrome = isPalindrome(121);
        System.out.println(isNumAPalindrome);
    }
    static boolean isPalindrome(int x){
        boolean res = false;
        int count = 0;
        while(x != 0){
            count++;
            x = x/10;
        }
        System.out.println(count);
        if(count % 2 != 0){
            int[] array1 = new int[count];

        } else {

        }
        return res;
    }
}
