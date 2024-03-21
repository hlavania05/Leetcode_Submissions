class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int i = piles.length/3; 
        while(i < piles.length){
            sum += piles[i];
            i += 2;
        }
        return sum;
    }
}