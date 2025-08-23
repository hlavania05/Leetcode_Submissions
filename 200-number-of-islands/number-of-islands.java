class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] isVisited = new int[n][m];

        int[][] dir = {{1,0}, {0,1}, {-1, 0}, {0, -1}};
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1' && isVisited[i][j] == 0){
                    dfs(i, j, isVisited, grid, dir);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(int i, int j, int[][] isVisited, char[][] grid, int[][] dir){
        isVisited[i][j] = 1;

        
        for(int x=0; x<dir.length; x++){
            int nr = i + dir[x][0];
            int nc = j + dir[x][1];
            if(nr >= 0 && nr < grid.length && nc >=0 && nc < grid[0].length && grid[nr][nc] == '1' && isVisited[nr][nc] == 0){
                dfs(nr, nc, isVisited, grid, dir);
            }
        }

    }
}