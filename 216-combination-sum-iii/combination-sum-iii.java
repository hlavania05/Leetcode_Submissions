class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        if(k > n){
            return result;
        }
        func(k, n, result, lst, 1);
        return result;
    }
    public void func(int k, int n, List<List<Integer>> result, List<Integer> lst, int start){
        if(n == 0 && lst.size() == k){
            result.add(new ArrayList<>(lst));
            return;
        }
        if(n < 0 || lst.size() > k){
            return;
        }
        for(int i=start; i<=9; i++){
            lst.add(i);
            func(k, n-i, result, lst, i+1);
            lst.remove(lst.size()-1);

        }

    }
}