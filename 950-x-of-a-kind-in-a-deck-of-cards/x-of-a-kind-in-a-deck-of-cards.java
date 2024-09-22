class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length == 1){
            return false;
        }
        // Initializing HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Storing frequencies into map
        for(int item : deck){
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        // now check wheather all frequencies are same or not
        int x = map.get(deck[0]);
        for(int value : map.values()){
            x = hcf(x, value);
            if(x == 1){
                return false;
            }
        }
        return true;
    }
    public int hcf(int x, int y){
        if(y == 0){ return x; }
        return hcf(y, x%y);
    }
}