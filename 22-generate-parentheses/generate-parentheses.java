class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        generate(n, lst, "", 0, 0);
        return lst;
    }
    public void generate(int n, List<String> lst, String ans, int open, int close){
    if(ans.length() == 2 * n){
        lst.add(ans);
        return;
    }

    if(open < n){
        generate(n, lst, ans + "(", open + 1, close);
    }
    if(close < open){
        generate(n, lst, ans + ")", open, close + 1);
    }
}

    
}