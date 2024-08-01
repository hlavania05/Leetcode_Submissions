class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (b[0] == a[0]) {
                return b[1] - a[1];
            } else {
                return b[0] - a[0];
            }
        });
        for(int item : arr){
            maxHeap.add(new int[]{Math.abs(item - x), item});
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        while(maxHeap.size() != 0){
            int[] elements = maxHeap.poll();
            ans.add(elements[1]);
        }
        Collections.sort(ans);
        return ans;

    }
}