class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int j : nums2){
            set2.add(j);
        }
        set1.retainAll(set2);
        int[] ans = new int[set1.size()];
        int idx = 0;
        for(int item : set1){
            ans[idx++] = item;
        }
        return ans;

    }
}