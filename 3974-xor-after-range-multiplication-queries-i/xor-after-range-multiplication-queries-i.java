class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int totalQueries = queries.length;
        for(int i=0; i<totalQueries; i++){
            int[] query = queries[i];
            int li = query[0];
            int ri = query[1];
            int ki = query[2];
            int vi = query[3];
            for(int idx=li; idx<=ri; idx += ki){
                nums[idx] = (int)(((long)nums[idx] * vi) % 1000000007);
            }
        }

        // bitwise XOR of final result;
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}