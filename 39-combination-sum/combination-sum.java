class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        func(candidates, target, l, lst, 0);
        return lst;
    }
    public void func(int[] arr, int target, List<Integer> lst, List<List<Integer>> ans, int start){
        if(target == 0){
            ans.add(new ArrayList<>(lst));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i=start; i<arr.length; i++){
            lst.add(arr[i]);
            func(arr, target - arr[i], lst, ans, i);
            lst.remove(lst.size()-1);
        }
    }
}