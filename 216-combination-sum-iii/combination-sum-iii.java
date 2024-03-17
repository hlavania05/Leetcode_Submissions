class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        comb(k, ans, result, n, 1);
        return result;
    }
    public void comb(int k, List<Integer> ans, List<List<Integer>> result, int target, int idx){
        if(target < 0 || ans.size() > k){
            return;
        }
        if(target == 0 && ans.size() == k){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx; i<=9; i++){
            ans.add(i);
            comb(k, ans, result, target - i, i+1);
            ans.remove(ans.size()-1);
        }
    }
}