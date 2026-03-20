import java.util.*;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {

                TreeSet<Integer> set = new TreeSet<>();
                int minDiff = Integer.MAX_VALUE;

                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        int val = grid[x][y];

                        // Skip duplicates (important fix)
                        if (set.contains(val)) continue;

                        Integer floor = set.floor(val);
                        Integer ceil = set.ceiling(val);

                        if (floor != null)
                            minDiff = Math.min(minDiff, Math.abs(val - floor));

                        if (ceil != null)
                            minDiff = Math.min(minDiff, Math.abs(val - ceil));

                        set.add(val);
                    }
                }

                // If only one distinct element
                if (minDiff == Integer.MAX_VALUE) minDiff = 0;

                ans[i][j] = minDiff;
            }
        }

        return ans;
    }
}