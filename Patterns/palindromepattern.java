package Patterns;

import java.util.Scanner;

public class palindromepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        palindrome(rows);
        
    }
    public static void palindrome(int rows){
        for ( int i = 1; i<=rows; i++ ){

            //space
            for(int j = 1; j<=rows-i; j++ ){
                System.out.print(" ");
            }

            //desecending
            for(int j = i; j>=1;j--){
                System.out.print(j);
            }

            // ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

