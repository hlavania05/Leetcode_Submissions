class Solution {
    public List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        func(n, result, "", 0, 0);
        return result;    
    }
    public void func(int n, List<String> result, String ans, int open, int close){
        if(ans.length() == 2*n){
            result.add(ans);
            return;
        }
        if(open < n){
            func(n, result, ans + "(", open + 1, close);
        }
        if(close < open){
            func(n, result, ans + ")", open, close + 1);
        }
    }
}