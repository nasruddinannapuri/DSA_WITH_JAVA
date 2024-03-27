package Recursion;

import java.util.Scanner;

public class NQueen {
    /*
     * Here we will get three type of sols:
     * 1) Print all Sol's
     * 2) Count the no's of possible ways(imp)
     * 3) Print only one Sol if possible 
     * 
     * Time Complexity: O(n!)
     * Recurence relation:
     * T(n) = 1QueenPlace * T(n-1) + isSafe()
     * T(n) = n * T(n-1) + isSafe() 
     * 
     */
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n no. of Queens: ");
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        
        // Initialization
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        nQueen(board, 0);
        System.out.println("Total ways to solve n Queens = "+ count);

    }

    public static void nQueen(char board[][], int row){
        // base
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }

        // column loop
        for(int j = 0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board,row+1); // function call
                board[row][j] = 'x'; // backtracking step
            }
            
        }
        
        
    }

    public static boolean isSafe(char board[][], int row, int col){

        
        // vertical up
        for(int j = row-1; j>=0; j--){
            if(board[j][col] == 'Q'){
                return false;
            }
        }
        // diagonal up-left
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--,j-- ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diagonal up-right
        for(int i = row-1, j= col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]){
        
        System.out.println("---------------- chess baord -----------------");
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    /*
     * Print only 1 sol: 
     * 1) yes - 1 sol
     * 2) no 
     * 
     * public static boolean nQueen(char board[][], int row){
        // base
        if(row == board.length){
            printBoard(board);
            count++;
            return true;
        }

        // column loop
        for(int j = 0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                if(nQueen(board,row+1)){
                    return true;
                }
                board[row][j] = 'x'; // backtracking step
            }
            
        }
        return false;
    }

    in main function :
    if(nQueen(board,0)){
        System.out.println("Solution is possible");
        printBoard(board);
    } else{
        System.out.println("Solution is not possible");
    }
     * 
     * 
     */
}
