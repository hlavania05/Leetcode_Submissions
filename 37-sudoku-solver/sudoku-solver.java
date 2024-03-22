class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
    public static boolean solve(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col + 1;
        }
        else{
            nrow = row + 1;
            ncol = 0;
        }
        if(board[row][col] != '.'){
            if(solve(board, nrow, ncol)){
                return true;
            }
        }
        else{
            for(int val=1; val<=9; val++){
                if(isSafe(board, row, col, val)){
                    board[row][col] = (char)(val + '0');
                    if(solve(board, nrow, ncol)){
                        return true;
                    }
                    else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] board, int row, int col, int val){
        // Check in row
        for(int i=0; i<board.length; i++){
            if(board[row][i] == (char)(val+'0')){
                return false;
            }
        }
        // Check in column
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char)(val+'0')){
                return false;
            }
        }
        // Check in 3*3 Grid
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == (char)(val+'0')){
                    return false;
                }
            }
        }
        return true;
    }
}