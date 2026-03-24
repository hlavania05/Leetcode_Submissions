class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int mod = 12345;

        int[][] prefix = new int[n][m];
        int[][] suffix = new int[n][m];

        int lastProd = 1;

        // Prefix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                prefix[i][j] = lastProd;
                lastProd = (int)((1L * lastProd * grid[i][j]) % mod);
            }
        }

        lastProd = 1;

        // Suffix
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                suffix[i][j] = lastProd;
                lastProd = (int)((1L * lastProd * grid[i][j]) % mod);
            }
        }

        // Result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = (int)((1L * prefix[i][j] * suffix[i][j]) % mod);
            }
        }

        return grid;
    }
}