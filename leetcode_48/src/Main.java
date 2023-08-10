/*
https://leetcode.com/problems/rotate-image/

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate
another 2D matrix and do the rotation.
*/

public class Main {
    public void rotate(int[][] matrix) {
        //Transpose the matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix[0].length; col++) {
                int tmp;
                tmp = matrix[col][row];
                matrix[col][row] = matrix[row][col];
                matrix[row][col] = tmp;

            }
        }

        //Flip by vertical
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length / 2; col++) {
                int tmp;
                tmp = matrix[row][matrix[0].length - 1 - col];
                matrix[row][matrix[0].length - 1 - col] = matrix[row][col];
                matrix[row][col] = tmp;
            }
        }
    }

    public static void main(String[] args) {

    }
}