package Patterns;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
        butterfly(rows);
    }
    
    public static void butterfly(int rows){

        //1st half
        for(int i = 1; i<=rows; i++){

            //stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            //spaces - 2*n-i
            for(int j = 1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = rows; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            //spaces - 2*n-i
            for(int j = 1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
