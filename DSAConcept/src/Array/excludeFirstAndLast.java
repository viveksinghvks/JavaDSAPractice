package Array;

import java.util.Arrays;

/*Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]
*/
public class excludeFirstAndLast {
    static int[] myArray = {1, 2, 3, 4,5,7};
    public static int[] middle(int[] array) {
        int[] result = new int[array.length-2];
        System.arraycopy(array, 1, result, 0, array.length - 1 - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(middle(myArray)));

    }

}
