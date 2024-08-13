class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates, ans, result, target, 0);
        return result;
    }
    public static void combination(int[] arr, List<Integer> ans, List<List<Integer>> result, int target, int idx){
        if(target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i=idx; i<arr.length; i++){
            if(i > idx && arr[i] == arr[i-1]){ continue; }
            if(arr[i] > target){ break; }

            ans.add(arr[i]);
            combination(arr, ans, result, target - arr[i], i+1);
            ans.remove(ans.size()-1);
        }
    }
}