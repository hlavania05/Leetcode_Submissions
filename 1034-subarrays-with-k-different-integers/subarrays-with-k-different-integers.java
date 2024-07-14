class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return cntsubarrays(nums, k) - cntsubarrays(nums, k-1);
    }
    public int cntsubarrays(int[] arr, int k){
        if(k<0){
            return 0;
        }
        int l = 0;
        int r = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r < arr.length){
            int x = arr[r];
            map.put(x, map.getOrDefault(x, 0)+1);
            while(map.size() > k){
                if(map.get(arr[l]) == 1){
                    map.remove(arr[l]);
                }
                else { map.put(arr[l], map.get(arr[l])-1); }
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
}