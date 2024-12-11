package com.kamilrr.java.git;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args){
        IfElseStatements ifElse = new IfElseStatements();
        ifElse.showIfElse(5,1);

        System.out.println("-------------------------------------------------------------");
        Example1.showMax(3, 3, 3);

        System.out.println("-------------------------------------------------------------");
        String canEnter = TernaryOperator.runTernaryOperator(19);
        System.out.println(canEnter);

        System.out.println("-------------------------------------------------------------");
        String day= SwitchCase.dayOfWeek(2);
        System.out.println(day);

        System.out.println("-------------------------------------------------------------");
        SwitchCase2.numOfMonth(10);

        System.out.println("-------------------------------------------------------------");
        String isLeap = SwitchCase3.isLeapYear(11,2036);
        System.out.println(isLeap);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Demonstration of Overload method work:");
        String res1 = OverloadMethod.multiply(5.45f, 654.789f);
        int res2 = OverloadMethod.multiply(5, 54);
        double res3 = OverloadMethod.multiply(548.456, 4684.64);
        int res4 = OverloadMethod.multiply("79", "2");
        System.out.println("multiply float to float = " + res1);
        System.out.println("multiply int to int = " + res2);
        System.out.println("multiply double to double = " + res3);
        System.out.println("multiply String to String = " + res4);
    }
}

