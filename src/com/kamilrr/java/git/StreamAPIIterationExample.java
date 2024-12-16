package com.kamilrr.java.git;

import java.util.Arrays;

public class StreamAPIIterationExample {
    public static void main(String[] args) {
        int[] array1 = {4, 54, 46, 7, 8, 9, 12, 766};
        double avg1 = Arrays.stream(array1).average().orElse(-1);
        System.out.println(avg1);

        Arrays.stream(array1).forEach((n) -> System.out.print(n + " "));
    }
}
