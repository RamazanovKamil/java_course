package com.kamilrr.java.git;

import java.util.Arrays;

class StartArray{
    public static void main(String[] args) {
        ArraysExample.showArray();
        VariableArgumentsExample.demonstrateVarargs(5,6,9,7,648,684,9);
        ForEachLoopExample.demonstrateForEachLoop("Hello! ","Java ","World");
        Arrays2DExample.demonstrate2DArray();
    }
}
public class ArraysExample {
    static void showArray(){
        int[] array1 = new int[5];
        array1[0] = 24;
        array1[1] = 6486;
        array1[2] = 96984;
        array1[3] = 66;
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"Alex","Malex","Lora","Milora"};
        System.out.println(Arrays.toString(array2));

        double[] array3 = new double[]{15.2,454.54,456.4};
        System.out.println(Arrays.toString(array3));
    }
}
class VariableArgumentsExample{
    static void demonstrateVarargs(int... values){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        double avgArrayValues = (double)sum / values.length;
        System.out.println(avgArrayValues);
    }
}
class ForEachLoopExample{
    static void demonstrateForEachLoop(String... args){
        String statement = "";
        for(String element : args){
            statement += element;
        }
        System.out.println(statement);
    }
}
class Arrays2DExample{
    static void demonstrate2DArray(){
        int[][] array2d = {{5,7,9,4}, {1,2}, {0}, {4,97,648,87,797,4846,474,49}};
        for(int i = 0; i < array2d.length; i++) {
            for(int j = 0; j < array2d[i].length; j++){
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}