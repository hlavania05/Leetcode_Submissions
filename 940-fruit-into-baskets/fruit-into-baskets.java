class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int r=0; r < fruits.length; r++){
            int item = fruits[r];
            map.put(item, map.getOrDefault(item, 0)+1);
            while (map.size() > 2) {
                int leftItem = fruits[l];
                map.put(leftItem, map.get(leftItem) - 1);
                if (map.get(leftItem) == 0) {
                    map.remove(leftItem);
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen;

    }
}