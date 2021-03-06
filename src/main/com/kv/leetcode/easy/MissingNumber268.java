package main.com.kv.leetcode.easy;

import java.util.Scanner;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 *
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber268 {
    public static void main(String[] args) {
       int [] nums = new int[]{9,6,4,2,3,5,7,0,1};
       System.out.println("The odd number is: "+missingNumber(nums));
    }

    /**
     *
     * @param nums
     * @return missing number
     */
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        int sumOfArrayNumbers=0;
        for(int i =0 ; i<nums.length;i++){
            sumOfArrayNumbers+=nums[i];
        }
        return totalSum - sumOfArrayNumbers;
    }
}
