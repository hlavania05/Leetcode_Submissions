class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxPoints = 0;
        int i = 0;
        int j = cardPoints.length-1;
        int sum = 0;
        while(i < k){
            sum += cardPoints[i];
            i++;
        }
        maxPoints = Math.max(maxPoints, sum);
        i = k-1;
        while(i >= 0){
            sum = sum - cardPoints[i];
            i--;
            sum = sum + cardPoints[j];
            j--;
            maxPoints = Math.max(maxPoints, sum);
        }
        return maxPoints;

    }
}