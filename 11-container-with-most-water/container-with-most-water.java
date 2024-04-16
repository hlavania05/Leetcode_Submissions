class Solution {
    public int maxArea(int[] height) {
        return area(height);
    }
    public static int area(int[] arr) {
        int max_area = 0;
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int h = Math.min(arr[left], arr[right]);
            int w = right-left;
            int area = h*w;
            max_area = Math.max(max_area, area);
            if 
            (arr[left] < arr[right]){
                left++;
            } 
            else{
                right--;
            }
        }

        return max_area;
    }
}