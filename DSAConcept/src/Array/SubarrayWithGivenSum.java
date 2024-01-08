package Array;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int currentSum = arr[0];
        int start = 0 ;
        for(int i = 1; i<n; i++){
            while(currentSum>s && start < i-1){
                currentSum -= arr[start];
                start++;
            }
            if(currentSum == s){
                ArrayList<Integer> result = new ArrayList<>();
                result.add(start+1);
                result.add(i);
                return result;
            }
            if (i < n) {
                currentSum += arr[i];
            }
            System.out.println(currentSum);
        }

        return new ArrayList<>() {{ add(-1); }};
    }

    public static void main(String[] args) {
        int N = 5;
        int S = 12 ;
        int A[] = {1,2,3,7,5} ;
        subarraySum(A, N, S);
    }

}
