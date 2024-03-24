package Patterns;

import java.util.Scanner;

public class HallowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        hallow(rows);
    }
    public static void hallow(int rows){
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=rows; j++){
                if(j==1 || j==rows || i==1 || i==rows){
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
