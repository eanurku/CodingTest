package com.anurag.problem01_two_sum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] out = twoSum(new int[]{3, 2, 4}, 6);
        Arrays.stream(out).forEach(s-> System.out.println(s));

    }

    public static int[] twoSum(int[] nums, int target) {

        int outputArray[] = new int[2];

        int start = 0;
        int end = nums.length - 1;
        int sum;
        boolean found = false;
        Arrays.sort(nums);
        while (start < end) {

            sum = nums[start] + nums[end];

            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                found = true;
                break;
            }
        }
        if(found){
            outputArray[0]=nums[start];
            outputArray[1]=nums[end];
        }

        return outputArray;
    }
}
