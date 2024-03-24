package Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
        triangle(rows);
    }
    public static void triangle(int rows){
        int x = 1;
        for( int i = 1; i<=rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
