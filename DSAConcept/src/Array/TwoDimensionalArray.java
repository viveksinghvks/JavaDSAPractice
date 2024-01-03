package Array;


import java.util.Arrays;

public class TwoDimensionalArray {
    static int[][] arr2D = null;
    public static void create2DArray(int rowNumber, int colNumber){
        arr2D = new int[rowNumber][colNumber];
        for(int i = 0; i< arr2D.length; i++){
            for(int j=0; j<arr2D[0].length;j++){
                arr2D[i][j]=Integer.MIN_VALUE;
            }
        }
    }

    public static void insertElement(int rowIndex, int colIndex, int valueToBeInserted){
        try{
            if(arr2D[rowIndex][colIndex]==Integer.MIN_VALUE){
                arr2D[rowIndex][colIndex] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            }
            else System.out.println("Already Occupied");
        }catch(Exception e){
            System.out.println("Index not accessible");
        }
    }

    public static void transverseArray(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");;
            }
        }
        System.out.println(" ");
        //for(int i = 0; i< arr.length; i++){
        //            for(int j = 0; j<arr[0].length; j++){
        //                System.out.print(arr[i][j] + " ");
        //                System.out.println(" ");
        //            }
        //        }
    }

    public static void searchElement(int[][] arr, int valueToBeSearch){
        try{
            for (int[] ints : arr) {
                for(int col = 0; col< ints.length; col++) {
                    if ( ints[col] == valueToBeSearch) {
                        System.out.println("Element Found");
                        return;
                    }
                }
            }
            System.out.println("Element not found in array");
        }catch (Exception e )
        {
            System.out.println("Not a valid input");
        }
    }

    public static void deleteValue(int row, int col){
        try{
            arr2D[row][col] = Integer.MIN_VALUE;
            System.out.println("Deleted");
            System.out.println(Arrays.deepToString(arr2D));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }

    }

    public static void main(String[] args) {
        create2DArray(2,2);
        insertElement(1,1,5);
        insertElement(1,1,5);
        insertElement(0,0,7);
        insertElement(0,1,2);
        insertElement(1,0,9);
        System.out.println(Arrays.deepToString(arr2D));

        transverseArray(arr2D);
        searchElement(arr2D, 5);
        searchElement(arr2D, 20);
        deleteValue(0,0);
    }
}
