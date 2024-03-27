package Recursion;

public class binaryStrings {
    public static void main(String[] args) {
        printBinaryString(0, 0, new StringBuilder() );
    }
    public static void printBinaryString(int n , int lastPlace, StringBuilder str){
        if(lastPlace == 0){
            str.append("0");
        }
    }
}

