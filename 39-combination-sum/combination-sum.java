class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        combination(candidates, ans, result, target, 0);
        return result;
    }
    // time complexity --> 2^t * k
    public void combination(int[] arr, List<Integer> ans, List<List<Integer>> result, int target, int idx){
        if(idx == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(ans));
            }
            return;
        }
        if(arr[idx] <= target){
            ans.add(arr[idx]);
            combination(arr, ans, result, target - arr[idx], idx);
            ans.remove(ans.size()-1);
        }
        combination(arr, ans, result, target, idx+1);
    }
}