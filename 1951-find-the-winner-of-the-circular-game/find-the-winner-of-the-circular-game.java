class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> lst = new ArrayList<>();
        for(int i=1; i<=n; i++){
            lst.add(i);
        }
        return func(lst, k, 0);
    }
    public int func(List<Integer> lst, int k, int i){
        if(lst.size() == 1){
            return lst.get(0);
        }
        int idx = (i+k-1) % (lst.size());
        lst.remove(idx);
        return func(lst, k, idx);
    }
}