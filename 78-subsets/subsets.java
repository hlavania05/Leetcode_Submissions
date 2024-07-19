class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        subsets(nums, result, lst, 0);
        return result;
    }
    public static void subsets(int[] arr, List<List<Integer>> result, List<Integer> lst, int idx){
        result.add(new ArrayList<>(lst));
        for(int i=idx; i<arr.length; i++){
            lst.add(arr[i]);
            subsets(arr, result, lst, i+1);
            lst.remove(lst.size()-1);
        }
    }
    
}