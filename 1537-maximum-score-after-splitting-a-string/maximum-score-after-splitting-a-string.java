class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] zero = new int[n];
        zero[0] = s.charAt(0) == '0' ? 1 : 0;
        for(int i=1; i<n; i++){
            zero[i] = zero[i-1] + (s.charAt(i) == '0' ? 1 : 0);
        }

        int[] one = new int[n];
        one[n-1] = 0;
        for(int i=n-2; i>=0; i--){
            one[i] = one[i+1] + (s.charAt(i+1) == '1' ? + 1 : 0);
        }
        int maxScore = 0;
        for(int i=0; i<n-1; i++){
            maxScore = Math.max(maxScore, one[i]+zero[i]);
        }
        return maxScore;
        
    }
}