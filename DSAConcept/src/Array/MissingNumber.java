package Array;
/*
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Example

myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5
 */

public class MissingNumber {
    static int[] myArray = {1,2,3,4,6};

    static int findMissingNumberInArray(int[] arr) {
        int n = arr.length+1;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        System.out.println("Missing number in the array is : " + findMissingNumberInArray(myArray));
    }
}
