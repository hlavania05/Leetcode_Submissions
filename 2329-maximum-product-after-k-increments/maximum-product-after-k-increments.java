class Pair{
    int num;
    int idx;
    Pair(int num, int idx){
        this.num = num;
        this.idx = idx;
    }
}
class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b) -> a.num - b.num);
        for(int i=0; i<nums.length; i++){
            Pair pair = new Pair(nums[i], i);
            minHeap.add(pair);
        }
        while(k > 0){
            Pair p = minHeap.poll();
            int idx = p.idx;
            p.num = p.num+1;
            nums[idx] = p.num;
            minHeap.add(p);
            k--;
        }
        long prod = 1;
        for(int item : nums){
            prod = (prod * item) % 1000000007;
        }
        return(int) prod;
    }
}