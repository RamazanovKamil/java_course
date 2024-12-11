package com.kamilrr.java.git;

import java.time.Year;

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
class SwitchCase2 {
    static void numOfMonth(int month){
        switch (month){
            case 1,3,5,7,8,10,12 -> System.out.println("This month has 31 day");
            case 2 -> System.out.println("This month has 28 or 29 days");
            case 4,6,9,11 -> System.out.println("This month has 30 days");
            default -> System.out.println("This is incorrect number of month!");
        }
    }
}
class SwitchCase3 {
    static String isLeapYear(int month, int year){
        String result = switch (month) {
            case 1,3,5,7,8,10,12 -> {
                yield Year.isLeap(year) ? "This month has 31 day. This year is leap." : "This month has 31 day. This year isn't leap.";
            }
            case 2 -> {
                if (Year.isLeap(year)) {
                    yield "February has 29 days. This year is leap.";
                } else {
                    yield "February has 28 days. This year isn't leap.";
                }
            }
            case 4,6,9,11 -> {
                yield Year.isLeap(year) ? "This month has 30 day. This year is leap." : "This month has 30 day. This year isn't leap.";
            }
            default -> "This is incorrect number of month!";
        };
        return result;
    }
}