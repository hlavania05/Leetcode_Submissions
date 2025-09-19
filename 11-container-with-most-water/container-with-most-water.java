class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length-1;
        while(low < high){
            int area = (high - low)*(Math.min(height[low], height[high]));
            maxArea = Math.max(area, maxArea);
            if(height[low] < height[high]){
                low++;
            }
            else{ high--; }
        }
        return maxArea;
    }
}