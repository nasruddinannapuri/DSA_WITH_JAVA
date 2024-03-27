package Recursion;

public class sudoko {
    public static void main(String[] args) {
        int[][] sudo = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3},   
        };
        if(sudouSolver(sudo, 0, 0)){
            System.out.println("Solution exists!");
            printSudoku(sudo);
        } else{
            System.out.println("Solution doesn't exists!");
        }
    }
    public static boolean sudouSolver(int sudo[][], int row, int col){
        // base case
        if(row == 9){
            return true;
        }
    
        // recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow = row + 1;
            nextCol = 0;
        }
        
        if(sudo[row][col] != 0){
            return sudouSolver(sudo, nextRow, nextCol);
        }
        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(sudo, row, col, digit)){
                sudo[row][col] = digit;
                if(sudouSolver(sudo, nextRow, nextCol)){ // sol's exists
                    return true;
                }
                sudo[row][col] = 0;
            }
        }
        return false;
    }    

    public static boolean isSafe(int sudo[][], int row, int col, int digit){
        // column
        for(int i = 0; i<=8; i++){
            if(sudo[i][col] == digit){
                return false;
            }
        }

        // row
        for(int i = 0; i<=8; i++){
            if(sudo[row][i] == digit){
                return false;
            }
        }

        // grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        // 3x3 grid
        for(int i = sr; i<sr+3; i++){
            for(int j = sc; j<sc+3; j++){
                if(sudo[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printSudoku(int[][] sudo){
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                System.out.print(sudo[i][j]+" ");
            }
            System.out.println();
        }
    }
}
