package BitwiseOperations;

public class oddOrEven {
    public static void main(String[] args) {
        oddoreven(0);
        oddoreven(3);
    }
    public static void oddoreven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
