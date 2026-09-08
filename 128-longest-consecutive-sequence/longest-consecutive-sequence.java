class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int item : nums){
            set.add(item);
        }

        int longest = 1;
        
        for(int item : set){
            if(set.contains(item-1)){
                continue;
            }
            int cnt = 1;
            int curr = item;
            while(set.contains(curr+1)){
                cnt++;
                curr++;
            }
            longest = Math.max(cnt, longest);
        }
        return longest;
    }
}