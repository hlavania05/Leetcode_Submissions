class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] cx = count(grid, n, m, 'X');
        int[][] cy = count(grid, n, m, 'Y');

        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(cx[i][j] == cy[i][j] && cx[i][j] != 0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public int[][] count(char[][] grid, int n, int m, char key){
        int[][] ans = new int[n][m];
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                char ch = grid[row][col];
                if(row == 0){
                    if(col == 0){
                        ans[row][col] = ch == key ? 1 : 0;
                    }
                    else{
                        ans[row][col] = ch == key ? 1 + ans[row][col-1] : ans[row][col-1];
                    }
                }
                else{
                    if(col == 0){
                        ans[row][col] = ch == key ? 1 + ans[row-1][col] : ans[row-1][col];
                    }
                    else{
                        int temp = ans[row-1][col] + ans[row][col-1] - ans[row-1][col-1];
                        ans[row][col] = ch == key ? 1 + temp : temp; 
                    }
                }
            }
        }
        return ans;
    }
}