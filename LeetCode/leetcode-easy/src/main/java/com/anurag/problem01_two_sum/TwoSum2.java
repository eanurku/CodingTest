package com.anurag.problem01_two_sum;


public class TwoSum2 {
    public static void main(String[] args) {

        int[] out = twoSum(new int[]{3,3}, 6);
        System.out.println(out[0]+" "+out[1]);


    }

    public static int[] twoSum(int[] nums, int target) {

        int outputArray[] = new int[2];

        int iindex=0;
        int jindex=0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && nums[i] + nums[j] == target) {
                    found = true;
                    iindex = i<j?i:j;
                    jindex = i<j?j:i;
                }
            }
        }
        if (found) {
            outputArray[0] =iindex;
            outputArray[1] = jindex;
        }
        return outputArray;
    }
}
