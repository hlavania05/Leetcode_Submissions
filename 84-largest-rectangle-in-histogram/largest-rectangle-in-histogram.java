class Solution {
    public int largestRectangleArea(int[] heights) {
        return func(heights, heights.length);
    }
    public int func(int[] arr, int n){
        int[] left = left(arr, n);
        int[] right = right(arr, n);
        int max_ar = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int ar = (right[i] - left[i] - 1) * arr[i];
            max_ar = Math.max(max_ar, ar);
        }
        return max_ar;
    }
    public int[] left(int[] arr, int n){
        int[] left = new int[n];
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stack.empty() && stack.peek().getKey() >= arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                left[i] = -1;
            }
            else{
                left[i] = stack.peek().getValue();
            }
            stack.push(new Pair<>(arr[i], i));
        }
        return left;
    }
    public int[] right(int[] arr, int n){
        int[] right = new int[n];
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!stack.empty() && stack.peek().getKey() >= arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                right[i] = arr.length;
            }
            else{
                right[i] = stack.peek().getValue();
            }
            stack.push(new Pair<>(arr[i], i));
        }
        return right;
    }
}