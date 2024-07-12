class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // int lsum = 0;
        // int rsum = 0;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += cardPoints[i];
        }
        int maxSum = sum;

        int rindex = cardPoints.length-1;
        for(int i=k-1; i>=0; i--){
            sum = sum - cardPoints[i];
            sum = sum + cardPoints[rindex];
            rindex--;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }
}