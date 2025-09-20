class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        boolean[][] visited = new boolean[n][m];

        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    dfs(grid, visited, dir, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(char[][] grid, boolean[][] visited, int[][] dir, int r, int c){
        visited[r][c] = true;

        for(int i=0; i<dir.length; i++){
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];
            if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && visited[nr][nc] == false && grid[nr][nc] == '1'){
                dfs(grid, visited, dir, nr, nc);
                
            }
        }
    }
}