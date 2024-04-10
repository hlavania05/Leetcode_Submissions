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
            max_area = Math.max(max_area, func(histogram));
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
    public int func(int[] arr){
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0 ;i <arr.length; i++){
            while(!st.empty() && arr[i] < arr[st.peek()]){
                int h = arr[st.pop()];
                int r = i;
                if(!st.isEmpty()){
                    int l = st.peek();
                    ans = Math.max(ans, h * (r - l -1));
                }
                else{
                    ans = Math.max(ans, h*r);
                }
            }
            st.push(i);
        }
        int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];

			if (st.isEmpty()) {
				int a = h * r;
				ans = Math.max(ans, a);
			} else {
				int l = st.peek();
				int a = h * (r - l - 1);
				ans = Math.max(ans, a);
			}
		}
		return ans;
    }
}