class freq implements Comparable<freq> {
    int item;
    int count;
    public freq(int item, int count){
        this.item = item;
        this.count = count;
    }
    public int compareTo(freq other){
        if(this.count != other.count){
            return other.count - this.count;
        }
        else{
            return other.item - this.item;
        }
    }
    public String toString(){
        return "{" + item + "," + count + "}";
    }
}

class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int item : barcodes){
            map.put(item, map.getOrDefault(item, 0)+1);
        }
        PriorityQueue<freq> maxHeap = new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            maxHeap.add(new freq(e.getKey(), e.getValue()));
        }
        int[] ans = new int[barcodes.length];
        freq prev = new freq(-1, 0);

        for(int i=0; i<barcodes.length; i++){
            freq current = maxHeap.poll();
            ans[i] = current.item;
            if(prev.count > 0){
                maxHeap.add(prev);
            }
            current.count--;
            prev = current;
        }

        return ans;
    }
}