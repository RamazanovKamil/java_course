package com.kamilrr.java.git;

public class MainClass {
    public static void main(String[] args){
        IfElseStatements ifElse = new IfElseStatements();
        ifElse.showIfElse(5,1);

        Example1.showMax(3, 3, 3);

        String canEnter = TernaryOperator.runTernaryOperator(19);
        System.out.println(canEnter);

        String day= SwitchCase.dayOfWeek(2);
        System.out.println(day);
    }
}

