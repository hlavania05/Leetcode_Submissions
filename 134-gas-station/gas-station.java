class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int diff = 0;
        int curr_gas = 0;
        int si = 0;
        for(int i=0; i<gas.length; i++){
            diff += (gas[i] - cost[i]);
            curr_gas += (gas[i] - cost[i]);
            if(curr_gas < 0){
                curr_gas = 0;
                si = i+1;
            }
        }
        if(diff < 0){
            return -1;
        }
        return si;
    }
}