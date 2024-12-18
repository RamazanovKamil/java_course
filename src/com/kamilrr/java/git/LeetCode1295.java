package com.kamilrr.java.git;

public class LeetCode1295 {
    public static void main(String[] args) {
        int count = findNumbersSecondWay(new int[]{12, 345, 2, 6, 7896, 46, 848798});
        System.out.println(count);
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(String.valueOf(nums[i]).length() % 2 == 0){
                count++;
            } else {
                continue;
            }
        }
        return count;
    }
    static int findNumbersSecondWay(int[] nums){
        int count = 0;
        for(int num : nums){
            int countOfNums = 0;
            while(num != 0){
                countOfNums++;
                num = num / 10;
            }
            System.out.println(countOfNums);
            if (countOfNums % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
