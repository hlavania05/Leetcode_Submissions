class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);
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
            if(i > start && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            lst.add(arr[i]);
            func(arr, target-arr[i], lst, ans, i+1);
            lst.remove(lst.size()-1);
        }
    }
}