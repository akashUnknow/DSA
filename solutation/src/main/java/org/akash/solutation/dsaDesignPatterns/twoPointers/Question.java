package main.java.org.akash.solutation.dsaDesignPatterns.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {
//    Problem 1: Reverse an Array
//    [1, 2, 3, 4, 5]-->[5, 4, 3, 2, 1]
    public int[] reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        }
        return arr;
    }
//    Problem 2: Two Sum (Sorted Array)
//    arr = [1, 2, 3, 4, 6], target = 6
    public boolean twoSumSorted(int[] arr,int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) return true;
            if (sum > target) j--;
            else i++;
        }
        return false;
    }
//    Problem 3: Valid Palindrome
//    Input: "madam"
//    Output: true
    public boolean isPalindrome(String string){
        int i=0,j=string.length()-1;
        while (i<j){
            if (string.charAt(i++)!=string.charAt(j--)) return false;
        }
        return true;
    }
    public int[] removeDuplicates(int[] arr){
        int slow =0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow]!= arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
        return arr;
    }
//    Problem 5: Container With Most Water
//    Input:[1,8,6,2,5,4,8,3,7]
//    Output:49
    public int maxArea(int[] arr){
        int left=0,right=arr.length-1,max=0;
        while (left<right){
            int area=Math.min(arr[left],arr[right])*(right-left);
            max=Math.max(area,max);
            if (arr[left]<arr[right]) left++;
            else right--;
        }
        return max;
    }
//    🔹 Problem Statement
//    Find all unique triplets such that sum = 0.
//    Input:[-1,0,1,2,-1,-4]
//    Output:[-1,-1,2], [-1,0,1]
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
