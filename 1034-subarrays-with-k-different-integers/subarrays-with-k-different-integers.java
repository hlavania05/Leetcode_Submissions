class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return cntsubarrays(nums, k) - cntsubarrays(nums, k-1);
    }
    public int cntsubarrays(int[] arr, int k){
        int l = 0;
        int r = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r < arr.length){
            int x = arr[r];
            map.put(x, map.getOrDefault(x, 0)+1);
            while(map.size() > k){
                int left = arr[l];
                map.put(left, map.get(left)-1);
                if(map.get(left) == 0){
                    map.remove(left);
                }
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
}