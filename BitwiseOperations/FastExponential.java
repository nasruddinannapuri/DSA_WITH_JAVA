package BitwiseOperations;

import java.util.Scanner;

public class FastExponential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. a: ");
        int a = sc.nextInt();
        System.out.println("Enter the no. n:");
        int n = sc.nextInt();
        fastExpo(a, n);

    }
    public static void fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1) != (0) ){ // check LSB
                ans = ans * a;

            }
            a = a * a;
            n = n>>1;
        }
        System.out.println(ans);
        
    }
    
}
