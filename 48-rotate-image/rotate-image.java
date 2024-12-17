class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int row=0; row<matrix.length; row++){
            int i = 0;
            int j = matrix.length-1;
            while(i < j){
                int temp = matrix[row][i];
                matrix[row][i] = matrix[row][j];
                matrix[row][j] = temp;
                i++;
                j--;
            }
        }
    }
    public void transpose(int[][] arr){
        for(int row=0; row<arr.length; row++){
            for(int col=row+1; col<arr.length; col++){
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }
}