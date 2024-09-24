class Solution {
    public int len(int num){
        int cnt = 0;
        while(num != 0){
            cnt++;
            num = num/10;
        }
        return cnt;
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int item : arr1){
            while(item != 0){
                set.add(item);
                item /= 10;
            }
        }

        int ans = 0;
        for(int item : arr2){
            while(item != 0){
                if(set.contains(item)){
                    int len = len(item);
                    ans = Math.max(ans, len);
                    break;
                }
                item /= 10;
            }
        }
        return ans;
    }

}