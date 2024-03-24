package Patterns;

import java.util.Scanner;

public class HollowRectangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        hallow(rows, columns);
        
        }
     public static void hallow(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if( i == 1 || i == rows || j == 1 || j == cols ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
