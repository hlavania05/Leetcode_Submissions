class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        return Index(gas, cost);
    }
    public static int Index(int[] gas, int[] cost){
        int sum = 0;
        int curr_sum = 0;
        int si = 0;

        for(int i=0; i<cost.length; i++){
            sum += (gas[i]-cost[i]);
            curr_sum += (gas[i]-cost[i]);
            if(curr_sum < 0){
                si = i+1;
                curr_sum = 0;
            }
        }

        if(sum<0){
            return -1;
        }

        return si;
    }
}