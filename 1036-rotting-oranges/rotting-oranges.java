class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0){
            return 0;
        }

        int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        int min = 0;
        while(queue.size() != 0){
            int size = queue.size();
            boolean isrotten = false;
            for(int i=0; i<size; i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[] d : dir){
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if(nr >= 0 && nc >= 0 && nr <n && nc < m && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        queue.add(new int[]{nr, nc});
                        fresh--;
                        isrotten = true;
                    }
                }

            }
            if(isrotten){ min++; }
        }
        return fresh == 0 ? min : -1;
    }
}