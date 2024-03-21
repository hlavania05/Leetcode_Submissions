class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0, n = piles.length;
        int i = n/3; 
        while(i < n){
            sum += piles[i];
            i += 2;
        }
        return sum;
    }
}