package com.kamilrr.java.git;

public class IfElseStatements {
    void showIfElse(int delimoe, int delitel){
        if (delitel != 0) {
            System.out.println("Answer = " + delimoe/delitel);
        } else {
            System.out.println("WARNING: delitel = 0");
        }
    }
}
class Example1 {
    static void showMax(int num1, int num2, int num3){
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Max between nums is num1: " + num1);
            } else {
                System.out.println("Max between nums is num3: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("Max between nums is num2: " + num2);
        } else {
            System.out.println("Max between nums is num3: " + num3);
        }
    }
}
class TernaryOperator {
    static String runTernaryOperator(int age){
        String canEnter = age >= 18 ? "Get in" : "Get out of here, you are young";
        return canEnter;
    }
}
class SwitchCase {
    static String dayOfWeek(int dayNum){
        switch (dayNum) {
            case 1:
                //System.out.println("Monday");
                return "Monday";
                //break;
            case 2:
                //System.out.println("Tuesday");
                return "Tuesday";
                //break;
            case 3:
                //System.out.println("Wednesday");
                return "Wednesday";
                //break;
            case 4:
                //System.out.println("Thursday");
                return "Thursday";
                //break;
            case 5:
                //System.out.println("Friday");
                return "Friday";
                //break;
            case 6:
                //System.out.println("Saturday");
                return "Saturday";
                //break;
            case 7:
                //System.out.println("Sunday");
                return "Sunday";
                //break;
            default:
                //System.out.println("It's not a valid day");
                return "It's not a valid day";
                //break;
        }
    }
}