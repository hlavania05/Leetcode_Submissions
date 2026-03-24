class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == x){
                map.put(cnt, i);
                cnt++;
            }
        }
        int[] res = new int[queries.length];
        int idx = 0;
        for(int query : queries){
            if(map.containsKey(query)){
                res[idx] = map.get(query);
            }
            else{
                res[idx] = -1;
            }
            idx++;
        }
        return res;
        
    }
}