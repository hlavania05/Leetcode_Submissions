class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> map = new HashMap<>();

        // store the every row in map in the form of string
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(grid[i][j]).append(",");
            }
            String rowString = sb.toString();
            map.put(rowString, map.getOrDefault(rowString, 0) + 1);
        }

        int cnt = 0;

        // check the every column matches with any row or not.
        for(int j=0; j<n; j++){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                sb.append(grid[i][j]).append(",");
            }
            String rowString = sb.toString();
            cnt += map.getOrDefault(rowString, 0);
        }
        return cnt;


    }
}