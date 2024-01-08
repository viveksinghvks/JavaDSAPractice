package Array;
import java.util.Arrays;

public class RotateMatrixClockwise {
    public void rotateMatrix(int[][] matrix) {
        System.out.println("Original Matrix: " + Arrays.deepToString(matrix));
        int len = matrix.length;
        for(int i = 0; i<len; i++){
            for(int j = i; j<len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i<len; i++){
            for(int j = 0; j<len/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-j-1];
                matrix[i][len-j-1] = temp;
            }
        }
        System.out.println("Rotated Matrix : " + Arrays.deepToString(matrix));

    }

    public static void main(String[] args) {
        RotateMatrixClockwise rm = new RotateMatrixClockwise();
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rm.rotateMatrix(arr);
    }
}

