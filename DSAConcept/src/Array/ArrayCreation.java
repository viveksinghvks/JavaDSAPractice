package Array;

import java.util.Arrays;

public class ArrayCreation {
    public void method1(){
        int[] arr1; // declaration
        arr1 = new int[3]; // instantiation
        arr1[0]= 1; // initialisation
        arr1[1]= 2;
        arr1[2]= 3;
        System.out.println(Arrays.toString(arr1));
    }

    public void method2(){
        int[] arr2 = new int[3]; // declaration and instantiation
        arr2[0]= 4;  // initialisation
        arr2[1]= 5;
        arr2[2]= 6;
        System.out.println(Arrays.toString(arr2));
    }
    public void method3(){
        int[] arr3 = {7,8,9}; // declaration,instantiation and initialisation
        System.out.println(Arrays.toString(arr3));
    }

    public void method1TwoDimension(){
        int[][] arr1; // declaration
        arr1 = new int[2][2]; // instantiation
        arr1[0][0]= 1; // initialisation
        arr1[0][1]= 2;
        arr1[1][0]= 3;
        arr1[1][1]= 4;
        System.out.println(Arrays.toString(arr1)); // print only memory reference
        System.out.println(Arrays.deepToString(arr1));
    }

    public void method2TwoDimension(){
        int[][] arr2 = new int[2][2]; // declaration and instantiation
        arr2[0][0]= 5; // initialisation
        arr2[0][1]= 6;
        arr2[1][0]= 7;
        arr2[1][1]= 8;
        System.out.println(Arrays.deepToString(arr2));
    }
    public void method3TwoDimension(){
        int[][] arr3 = {{7,8,9},{10,11}}; // declaration,instantiation and initialisation
        System.out.println(Arrays.deepToString(arr3));
//        System.out.println(arr3[1][2]); // out of bond
    }



    public static void main(String[] args) {
        ArrayCreation arr = new ArrayCreation();
        arr.method1();
        arr.method2();
        arr.method3();
        arr.method1TwoDimension();
        arr.method2TwoDimension();
        arr.method3TwoDimension();

    }
}
