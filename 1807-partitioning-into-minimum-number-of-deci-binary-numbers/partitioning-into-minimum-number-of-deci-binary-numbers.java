class Solution {
    public int minPartitions(String n) {
        return helper(n);
    }
    public int helper(String n){
        if(n.length()==1){
            return Integer.parseInt(n);
        }
        int max = Integer.MIN_VALUE;
        for(char ch : n.toCharArray()){
            max = Math.max(max, ch-'0');
        }

        return max;
    }
}