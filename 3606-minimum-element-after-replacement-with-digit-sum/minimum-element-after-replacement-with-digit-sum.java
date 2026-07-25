class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int item : nums){
            min = Math.min(min, sum(item));
        }
        return min;
    }
    public int sum(int num){
        int sum = 0;
        while(num != 0){
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}