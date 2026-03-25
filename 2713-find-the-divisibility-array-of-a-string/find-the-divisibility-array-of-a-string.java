class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int i = 0;
        String prefix = "";
        int[] res = new int[n];
        long sum = 0;
        for(char ch : word.toCharArray()){
            int digit = ch - '0';
            sum = (sum * 10 + digit) % m;

            if(sum == 0){
                res[i] = 1;
            }
            else{
                res[i] = 0;
            }
            i++;
        }
        return res;
    }
}