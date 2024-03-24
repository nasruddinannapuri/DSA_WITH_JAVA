package Patterns;

import java.util.Scanner;

public class InvertedHalfPyrNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
        pyramid(rows);

    }

    public static void pyramid(int rows){
        for ( int i = 1; i <= rows; i++ ){
            for( int j = 1; j <= rows-i+1; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
