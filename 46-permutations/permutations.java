class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        permutation(nums, lst, result);
        return result;
    }
    public static void permutation(int[] arr, List<Integer> lst, List<List<Integer>>  result){
        if(lst.size() == arr.length){
            result.add(new ArrayList<>(lst));
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!lst.contains(arr[i])){
                lst.add(arr[i]);
                permutation(arr, lst, result);
                lst.remove(lst.size() - 1);
            }
        }
    }
}