package com.DSA;



public class BinaryRecursion {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        int target = 6;

        int result = binarySearch(nums, target, 0, nums.length-1);

        if (result !=-1)
            System.out.println("element found at index : " + result);
        else
            System.out.println("Element not found");
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {

        if (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                return binarySearch(nums, target, mid + 1, right);
            else
                return binarySearch(nums, target, left, mid - 1);
        }
        return -1;
    }
}
