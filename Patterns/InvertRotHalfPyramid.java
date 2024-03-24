package Patterns;

import java.util.Scanner;

public class InvertRotHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        pyramid(rows);
    }

    public static void pyramid(int rows){
        for( int i = 1; i <= rows; i++ ){
            for( int j = 1; j <= rows; j++ ){
                if( j < rows-i+1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        
        }
    }
}
