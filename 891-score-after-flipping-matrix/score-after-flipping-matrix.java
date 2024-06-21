class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++){
            if(grid[i][0] == 0){
                flipRow(grid, i);
            }
        }
        for(int i=1; i<m; i++){
            if(countOneInCol(grid, i) < (n + 1) / 2) {
                flipCol(grid, i);
            }
        }
        return score(grid);
    }
    public void flipRow(int[][] arr, int row){
        for(int i=0; i<arr[0].length; i++){
            arr[row][i] = arr[row][i] ^ 1;
        }
    }
    public void flipCol(int[][] grid, int col){
        for(int i=0; i<grid.length; i++){
            grid[i][col] = grid[i][col] ^ 1;
        }
    }
    public int countOneInCol(int[][] arr, int col){
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i][col] == 1){
                cnt++;
            }
        }
        return cnt;
    }
    public int score(int[][] arr){
        int ans = 0;
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            int x = 0;
            for(int j=0; j<m; j++){
                if(arr[i][j] == 1){
                    x += (1 << m-j-1);
                }
            }
            ans += x;
        }
        return ans;

    }
}