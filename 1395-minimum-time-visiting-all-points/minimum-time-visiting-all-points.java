class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i=0; i<points.length-1; i++){
            int x = Math.abs(points[i][0] - points[i+1][0]);
            int y = Math.abs(points[i][1] - points[i+1][1]);
            ans += Math.max(x,y);
        }
        return ans;
    }
}