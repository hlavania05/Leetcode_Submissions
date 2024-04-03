class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> arr = new ArrayList<>();
        while(i < nums1.length && j <nums2.length){
            if(nums1[i] == nums2[j]){
                if(!arr.contains(nums1[i])){
                    arr.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] ans = new int[arr.size()];
        int x = 0;
        for(int num : arr){
            ans[x] = num;
            x++;
        }
        return ans;

    }
}