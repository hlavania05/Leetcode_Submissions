class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(mat[row][col] != mat[row][(col+k)%m]){
                    return false;
                }
            }
        }
        return true;
    }
}