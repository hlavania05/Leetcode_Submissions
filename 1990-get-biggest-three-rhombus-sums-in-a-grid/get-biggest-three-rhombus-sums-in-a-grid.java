import java.util.*;

class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        TreeSet<Integer> set = new TreeSet<>((a, b) -> b - a);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // size 0 rhombus (single cell)
                set.add(grid[i][j]);

                for (int k = 1; i - k >= 0 && i + k < m && j - k >= 0 && j + k < n; k++) {

                    int sum = 0;

                    int r = i - k;
                    int c = j;

                    // top -> right
                    for (int t = 0; t < k; t++) {
                        sum += grid[r + t][c + t];
                    }

                    // right -> bottom
                    for (int t = 0; t < k; t++) {
                        sum += grid[i + t][j + k - t];
                    }

                    // bottom -> left
                    for (int t = 0; t < k; t++) {
                        sum += grid[i + k - t][j - t];
                    }

                    // left -> top
                    for (int t = 0; t < k; t++) {
                        sum += grid[i - t][j - k + t];
                    }

                    set.add(sum);
                }
            }
        }

        int size = Math.min(3, set.size());
        int[] res = new int[size];

        int idx = 0;
        for (int val : set) {
            if (idx == size) break;
            res[idx++] = val;
        }

        return res;
    }
}