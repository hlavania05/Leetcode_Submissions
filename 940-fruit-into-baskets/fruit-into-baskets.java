class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0;
        int j = 0;
        int maxLen = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j < fruits.length){
            int right = fruits[j];
            map.put(right, map.getOrDefault(right, 0)+1);
            while(map.size() > 2){
                int left = fruits[i];
                map.put(left, map.get(left)-1);
                if(map.get(left) == 0){
                    map.remove(left);
                }
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
}