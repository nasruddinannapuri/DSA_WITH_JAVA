package Patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        dia(rows);

    }
    public static void dia(int rows){
        for (int i = 1; i<=rows; i++){
            //1st half
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i)-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i = rows; i>=1; i--){
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i)-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
