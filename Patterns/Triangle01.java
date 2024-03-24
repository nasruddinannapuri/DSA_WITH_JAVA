package Patterns;

import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
        triangle(rows);
    }

    public static void triangle(int rows){
        for ( int i = 1; i <= rows; i++ ){
            for ( int j = 1; j <= i; j++ ){
                if((i-j)%2 == 0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
