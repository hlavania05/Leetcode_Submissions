class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=1; i<n; i++){
            int x = arr[i] - arr[i-1];
            if(x < diff){
                diff = x;
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<n; i++){
            if(arr[i] - arr[i-1] == diff){
                List<Integer> ll = new ArrayList<>();
                ll.add(arr[i-1]);
                ll.add(arr[i]);
                ans.add(ll);
            }
        }
        return ans;
    }
}