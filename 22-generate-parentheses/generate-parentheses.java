class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        func(n, lst, "", 0, 0);
        return lst;
    }
    public void func(int n, List<String> lst, String ans, int close, int open){
        if(close > n || open > n){
            return;
        }
        if(close > open){
            return;
        }
        if(close == n && open == n){
            lst.add(ans);
            return;
        }
        func(n, lst, ans + "(", close, open+1);
        func(n, lst, ans + ")", close+1, open);
    }
}