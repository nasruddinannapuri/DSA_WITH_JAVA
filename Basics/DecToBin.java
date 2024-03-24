package Basics;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal no for conversion: ");
        int n = sc.nextInt();
        int bin = conversion(n);
        System.out.println("Binary of given number: "+ bin);
    }
    public static int conversion(int n) {
        int pow = 0;
        int out = 0;
        while(n>0){
            int remainder = n%2;
            out = out + (int) Math.pow(10, pow);
            pow++;
            n = n/2;

        }
        return out;
    }
}
