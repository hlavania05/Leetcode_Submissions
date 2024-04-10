class Solution {
    public int maximalRectangle(char[][] ma) {
        int[][] matrix = convert(ma);
        int[] histogram = new int[matrix[0].length];
        int max_area = 0;
        for(int i=matrix.length-1; i>=0; i--){
            for(int j=0; j<histogram.length; j++){
                if(matrix[i][j] != 0){
                    histogram[j] += matrix[i][j];
                }
                else{
                    histogram[j] = 0;
                }
            }
            max_area = Math.max(max_area, func(histogram, histogram.length));
        }
        return max_area;
    }
    public static int[][] convert(char[][] arr){
        int[][] ans = new int[arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                ans[i][j] = arr[i][j] - '0';
            }
        }
        return ans;
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