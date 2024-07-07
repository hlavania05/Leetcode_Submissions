class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            int newBottle = numBottles/numExchange;
            ans += newBottle;
            int remaining =  numBottles %  numExchange;
            numBottles = newBottle + remaining;
        }
        return ans;
    }
}