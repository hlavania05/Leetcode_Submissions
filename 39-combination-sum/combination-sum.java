class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        sum(target, candidates, lst, l, 0);
        return lst;
    }
    public void sum(int target, int[] candidates, List<List<Integer>> lst, List<Integer> l, int start){
        if(target == 0){
            lst.add(new ArrayList<>(l));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i=start; i<candidates.length; i++){
            l.add(candidates[i]);
            sum(target-candidates[i], candidates, lst, l, i);
            l.remove(l.size()-1);
        }
    }
    
}