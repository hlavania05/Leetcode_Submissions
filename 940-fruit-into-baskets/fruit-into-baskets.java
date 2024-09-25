class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int i = 0;
        int j = 0;
        while(j < fruits.length){
            int item = fruits[j];
            map.put(item, map.getOrDefault(item, 0) + 1);
            while(map.size() > 2){
                int left = fruits[i];
                map.put(left, map.get(left)-1);
                if(map.get(left) == 0){
                    map.remove(left);
                }
                i++;
            }
            len = Math.max(len, j-i+1);
            j++;
        }
        return len;
    }
}