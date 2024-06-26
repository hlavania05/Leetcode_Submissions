class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int num : nums){
            pq.offer(num);
        }
        while(k > 0){
            int max = pq.poll();
            score += max;
            if(max % 3 == 0){
                pq.offer(max/3);
            }
            else{
                pq.offer(max/3 + 1);
            }
            k--;
        }
        return score;
    }
}