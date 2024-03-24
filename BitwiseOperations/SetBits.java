package BitwiseOperations;

import java.util.Scanner;

public class SetBits {

    // imp 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("No of Set Bits :"+setBits(no)) ;
    }

    public static int setBits(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = (n>>1);
        }
        return count;
    }
    
}
