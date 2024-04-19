class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(visited[i][j] == 0 && grid[i][j] == '1'){
                    count++;
                    bfs(i, j, grid, visited);
                }
            }
        }
        return count;
    }
    public void bfs(int row, int col, char[][] arr, int[][] visited){
    visited[row][col] = 1;
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(row, col));

    int n = arr.length;
    int m = arr[0].length;

    int[] dr = {1, -1, 0, 0};
    int[] dc = {0, 0, 1, -1};

    while(!q.isEmpty()){
        Pair current = q.poll();
        int r = current.first;
        int c = current.second;

        for (int i = 0; i < 4; i++) {
            int newRow = r + dr[i];
            int newCol = c + dc[i];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && visited[newRow][newCol] == 0 && arr[newRow][newCol] == '1') {
                visited[newRow][newCol] = 1;
                q.add(new Pair(newRow, newCol));
            }
        }
    }
}
}