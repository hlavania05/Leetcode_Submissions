class Solution {
    int count;
    String res;
    public String getHappyString(int n, int k) {
        count = 0;
        res = "";
        backtrack(n, k, "");
        return res;
    }

    public void backtrack(int n, int k, String curr){
        if(curr.length() == n){
            count++;
            if(count == k){
                res = curr;
            }
            return;
        }
        char[] chars = {'a', 'b', 'c'};
        for(char ch : chars){
            if(res.length() > 0){
                return;
            }
            int len = curr.length();
            if(len > 0 && curr.charAt(len-1) == ch){
                continue;
            }
            backtrack(n, k, curr+ch);
        }
        return;
    }
}