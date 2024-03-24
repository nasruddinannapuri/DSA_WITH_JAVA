package Recursion;

import java.util.Scanner;

public class printNno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many no. you want to print: ");
        int n = sc.nextInt();
        printDec(n);
        System.out.println();
        printAsc(n);
    }
    public static void printDec(int n){
        if(n == 1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printAsc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printAsc(n-1);
        System.out.print(n+" ");
        
    }
}
