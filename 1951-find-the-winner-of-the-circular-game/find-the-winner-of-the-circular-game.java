class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> lst = new ArrayList<>();
        for(int i=1; i<=n; i++){
            lst.add(i);
        }
        int i = 0;
        while(lst.size() > 1){
            int idx = (i + k - 1) % (lst.size());
            lst.remove(idx);
            i = idx;
        }
        return lst.get(0);
    }
}