package Array;
/*
Given 2D array calculate the sum of diagonal elements.

Example

myArray2D= {{1,2,3},{4,5,6},{7,8,9}};

sumDiagonalElements(myArray2D) # 15
 */
public class DigoanalSumOf2DArray {
    static int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){
                if(i == j){
                    sum += array[i][j];
                }

            }
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Sum of diagonal elements of the given 2D Array is : " + sumDiagonalElements(myArray2D));
    }
}
