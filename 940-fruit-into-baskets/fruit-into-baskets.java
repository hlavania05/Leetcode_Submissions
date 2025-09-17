class Solution {
    public int totalFruit(int[] fruits) {
        // maximum length of substring with 2 distinct integer
        int left = 0;
        int right = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;

        while(right < fruits.length){
            int item = fruits[right];
            map.put(item, map.getOrDefault(item, 0)+1);
            while(map.size() > 2){
                int leftItem = fruits[left];
                map.put(leftItem, map.getOrDefault(leftItem, 0)-1);
                if(map.get(leftItem) == 0){
                    map.remove(leftItem);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}