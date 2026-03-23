class Solution {
    public int maxProductPath(int[][] grid) {
        long mod = 1000000007;
        int n = grid.length;
        int m = grid[0].length;

        long[][][] memo = new long[n][m][2];
        boolean[][] visited = new boolean[n][m];

        long[] ans = help(grid, 0, 0, n-1, m-1, memo, visited);

        // ans[0] is maxProd at (0,0)
        return ans[0] >= 0 ? (int)(ans[0] % mod) : -1;
    }

    public long[] help(int[][] grid, int row, int col, int n, int m,
                       long[][][] memo, boolean[][] visited) {

        // ── Base case FIRST ──
        if (row == n && col == m) {
            return new long[]{grid[row][col], grid[row][col]};
        }

        // ── Already computed ──
        if (visited[row][col]) {
            return memo[row][col];
        }

        long val = grid[row][col];
        long maxProd, minProd;

        if (row == n) {
            long[] right = help(grid, row, col+1, n, m, memo, visited);
            maxProd = val * right[0];
            minProd = val * right[1];

        } else if (col == m) {
            long[] down = help(grid, row+1, col, n, m, memo, visited);
            maxProd = val * down[0];
            minProd = val * down[1];

        } else {
            long[] down  = help(grid, row+1, col, n, m, memo, visited);
            long[] right = help(grid, row, col+1, n, m, memo, visited);

            long a = val * down[0];
            long b = val * down[1];
            long c = val * right[0];
            long d = val * right[1];

            maxProd = Math.max(Math.max(a, b), Math.max(c, d));
            minProd = Math.min(Math.min(a, b), Math.min(c, d));
        }

        memo[row][col][0] = maxProd;
        memo[row][col][1] = minProd;
        visited[row][col] = true;

        return memo[row][col];
    }
}