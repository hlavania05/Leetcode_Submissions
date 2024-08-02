class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int item : arr){
            map.put(item, map.getOrDefault(item, 0)+1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            minHeap.add(new int[]{e.getValue(), e.getKey()});
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] ans = new int[k];
        int idx = 0;
        while(minHeap.size() != 0){
            int[] elements = minHeap.poll();
            ans[idx] = elements[1];
            idx++;
        }
        return ans;
    }
}