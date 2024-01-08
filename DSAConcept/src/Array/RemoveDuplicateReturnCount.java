package Array;

/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Input: nums = [1, 1, 2]
Output: 2
 */

import java.util.Arrays;

public class RemoveDuplicateReturnCount {
    public static int countElementAfterRemovingDuplicate(int[] arr){
        int index = 0;
        for(int j = 1; j<arr.length; j++){
            if(arr[j] != arr[index]){
                index++;
                arr[index] = arr[j];
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        System.out.println("Count of elements after removing duplicates : " + countElementAfterRemovingDuplicate(arr));
    }

}
