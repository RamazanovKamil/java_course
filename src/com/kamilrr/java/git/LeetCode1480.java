package com.kamilrr.java.git;

import java.util.Arrays;

public class LeetCode1480 {
    public static void main(String[] args) {
        int[] outputArray = runningSum(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(outputArray));
    }
    static int[] runningSum(int[] nums){
        int[] outputArray = new int[nums.length];
        for(int i = 0; i < outputArray.length; i++){
            if(i == 0){
                outputArray[i] = nums[0];
            } else {
                outputArray[i] = outputArray[i-1] + nums[i];
            }
        }
        return outputArray;
    }
}
