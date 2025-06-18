class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        generate(n, lst, "", 0, 0);
        return lst;
    }
    public void generate(int n, List<String> lst, String ans, int open, int close){
        if(open < close){
            return;
        }
        if(open > n || close > n){
            return;
        }
        if(open == n && close == n){
            lst.add(ans);
        }
        generate(n, lst, ans+"(", open+1, close);
        generate(n, lst, ans+")", open, close+1);

    }
    
}