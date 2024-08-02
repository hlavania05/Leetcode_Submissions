class pair implements Comparable<pair> {
    int first;
    String second;
    public pair(int first, String second){
        this.first = first;
        this.second = second;
    }
    public int compareTo(pair other){
        if(this.first != other.first){
            return this.first - other.first;
        }
        return -this.second.compareTo(other.second);
    }
    @Override
    public String toString(){
        return second + " = " + first;
    }

}
class Solution {
    public List<String> topKFrequent(String[] arr, int k) {
        // Mapping the frequencies of the words in array
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : arr){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        
        // top k frequent words of heap me rakhenge baakiyo ko remove kr denge
        PriorityQueue<pair> minHeap = new PriorityQueue<>();
        for(Map.Entry<String, Integer> e : map.entrySet()){
            minHeap.add(new pair(e.getValue(), e.getKey()));
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        
        // end me jo bhi minHeap me rahega vo k frequents words honge unko hum ek list me store kr lenge
        List<String> ans = new ArrayList<>();
        while(minHeap.size() != 0){
            ans.add(minHeap.poll().second);
        }

        // ans se match karane ke lie hum ans list ko reverse kr denge
        Collections.reverse(ans); 
        return ans;
    }
}