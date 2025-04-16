package com.DSA;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {3,5,7,9,11,13,15};
        int target = 11;

       // int result = linearSearch(nums, target);

        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at Index : " + result);
        } else
            System.out.println("Element Not Found ");
    }

    public static int linearSearch(int[] nums, int target) {
        int step=0;
        for(int i =0; i<nums.length; i++){
            step++;
            if(nums[i] == target) {
                System.out.println("Step taken by Linear" + step);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = (left + right)/2;

            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else
                right = mid -1;

        }

        return -1;
    }
}
