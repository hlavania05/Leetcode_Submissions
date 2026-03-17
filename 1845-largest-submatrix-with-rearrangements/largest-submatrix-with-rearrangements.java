class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxArea = 0;
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(row > 0 && matrix[row][col] == 1){
                    matrix[row][col] += matrix[row-1][col];
                }
            }
            int[] sorted = matrix[row].clone();
            Arrays.sort(sorted);
            for(int i=0; i<m; i++){
                int base = m-i;
                int height = sorted[i];
                maxArea = Math.max(maxArea, base*height);
            }
        }
        return maxArea;
    }
}