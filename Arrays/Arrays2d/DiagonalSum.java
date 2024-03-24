package Arrays.Arrays2d;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
        diagonalsum(matrix);

    }

    public static void diagonalsum(int[][] matrix){
        int sum = 0;
        
        /* 
        for(int i = 0; i< matrix.length; i++){  //O(n)
            for(int j = 0; j<matrix[0].length; j++){
                //primary diagonal
                if(i==j){
                    sum += matrix[i][j];
                }

                //secondary diagonal
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }

        */


        for(int i = 0; i<matrix.length; i++){
            //pd
            sum+= matrix[i][i];
            //sd
            if(i!=matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }

        System.out.println(sum);
    }
}
