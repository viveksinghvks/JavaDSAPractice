package Array;
/*
Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.
Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}
 */

import java.util.Arrays;

public class FindTopTwo {
    static int[] myArray = {84,85,90,87,85,90,85,83,23,45,84,1,2,0};
    public static int[] findTopTwoScores(int[] array){
        int[] result = new int[2];
        int highestScore = Integer.MIN_VALUE;
        int secondHighestScore = Integer.MIN_VALUE;
        for(int score : array){
            if(score>highestScore){
                secondHighestScore = highestScore;
                highestScore = score;

            }
        }
        result[0] = highestScore;
        result[1] = secondHighestScore;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Top two scores inside given array are: " + Arrays.toString(findTopTwoScores(myArray)));
    }
}
