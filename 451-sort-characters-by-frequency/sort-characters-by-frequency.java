class Pair implements Comparable<Pair> {
    int freq;
    char ch;

    public Pair(int a, char b){
        this.freq = a;
        this.ch = b;
    }

    @Override
    public int compareTo(Pair other){
        if(other.freq != this.freq){ return other.freq - this.freq; }  // For max-heap, we reverse the comparison
        return this.ch - other.ch;
    }

    @Override
    public String toString(){
        return ch + "=" + freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        // Map the frequencies of characters in the string
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Traverse the map and put the characters in maxHeap with their frequencies
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>();
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            maxHeap.add(new Pair(e.getValue(), e.getKey()));
        }

        // Ans
        StringBuilder ans = new StringBuilder();
        while(maxHeap.size() != 0){
            int count = maxHeap.peek().freq;
            char my_ch = maxHeap.poll().ch;
            while(count != 0){
                ans.append(my_ch);
                count--;
            }
        }
        return ans.toString();
    }
}