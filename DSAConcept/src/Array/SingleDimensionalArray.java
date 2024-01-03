package Array;

import java.util.Arrays;

public class SingleDimensionalArray {
    static int[] intArray;
    public static void createArray(int arraySize){
        intArray = new int[arraySize];
        for(int i = 0; i<arraySize; i++){
            intArray[i]=Integer.MIN_VALUE;
        }

    }
    public static void insertValueInArray(int index, int value){
        try{
            if(intArray[index]== Integer.MIN_VALUE){
                intArray[index] = value;
                System.out.println("Element inserted successfully");
            }
            else System.out.println("Other element exist at the given index");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access");

        }

    }

    public static void arrayTrasversal(int arr[]){
        try{
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }catch (Exception e ) 
        {
            System.out.println("Array no longer available");
        }
    }
    public static void searchElement(int arr[], int valueToBeSearch){
        try{
            for (int j : arr) {
                if(j == valueToBeSearch) {
                    System.out.println("Element Found");
                    return;
                }
            }
            System.out.println("Element not found in array");
        }catch (Exception e )
        {
            System.out.println("Not a valid input");
        }
    }
    public static void deleteValue(int index){
        try{
            intArray[index] = Integer.MIN_VALUE;
            System.out.println("Deleted");
            System.out.println(Arrays.toString(intArray));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }

    }

    public static void main(String[] args) {
        createArray(5);
        insertValueInArray(0,5);
        insertValueInArray(0,5);
        insertValueInArray(1,7);
        insertValueInArray(2,9);
        insertValueInArray(4,10);
        insertValueInArray(3,15);
        insertValueInArray(7,10);
        System.out.println(Arrays.toString(intArray));
        //accessing element of array
        System.out.println(intArray[4]);
        arrayTrasversal(intArray);
        searchElement(intArray, 10);
        searchElement(intArray,17);
        deleteValue(3);
        deleteValue(9);
    }


}
