class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int item : nums){
            heap.add(item);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return heap.peek();
    }
}