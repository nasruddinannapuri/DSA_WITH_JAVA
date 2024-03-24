package Basics;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary no: ");
        int n = sc.nextInt();
        int dec = dec_conversion(n);
        System.out.println("Conversion of "+ n +" to the decimal is "+ dec);


    }
   
    public static int dec_conversion(int n){
        int pow = 0;
        int out = 0;
        while(n>0){
            int remainder = n%10;
            out = out + (remainder * (int) (Math.pow(2, pow )));
            pow++;
            n = n/10;
        }
        return out;

    }
}
