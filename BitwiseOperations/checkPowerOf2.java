package BitwiseOperations;

import java.util.Scanner;

public class checkPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to check: ");
        int no = sc.nextInt();
        check(no);
    }
    public static void check(int no){
        if((no & (no-1)) == 0){
            System.out.println("Given no. is a Power of two");
        }
        else{
            System.out.println("It's not a power of 2");
        }
    }
}
