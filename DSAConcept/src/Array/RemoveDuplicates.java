package Array;

import java.util.Arrays;
/*
Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

Example

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]
 */

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueElement = new int[arr.length];
        int[] duplicateElement = new int[arr.length];
        int dupIndex = 0;
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            boolean isDuplicate = false;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqueElement[index] = arr[i];
                index++;
            }
            if(isDuplicate){
                duplicateElement[dupIndex] = arr[i];
                dupIndex++;

            }
        }
        System.out.println("Duplicate Elements : " + Arrays.toString(Arrays.copyOf(duplicateElement, dupIndex)));
        return Arrays.copyOf(uniqueElement,index);

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        System.out.println("Arrays with unique elements only : " + Arrays.toString(removeDuplicates(arr)));
    }
}
