class Solution {
    public int largestRectangleArea(int[] arr) {
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