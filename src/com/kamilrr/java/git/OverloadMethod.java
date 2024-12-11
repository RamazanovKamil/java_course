package com.kamilrr.java.git;

public class OverloadMethod {
    static int multiply(int num1, int num2){
        int res = num1 * num2;
        return res;
    }
    static int multiply(String num1, String num2){
        int res = Integer.valueOf(num1) * Integer.valueOf(num2);
        return res;
    }
    static double multiply(double num1, double num2){
        double res = num1 * num2;
        return res;
    }
    static String multiply(float num1, float num2){
        String res = String.valueOf(num1 * num2);
        return res;
    }
}
