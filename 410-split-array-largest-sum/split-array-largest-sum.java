class Solution {
    public int splitArray(int[] nums, int k) {
        return min_time(nums, k);
    }
    public static int min_time(int [] board, int painters){
        int lo = max_length(board);
        int hi = 0;
        for(int i = 0; i < board.length; i++) {
            hi += board[i];
        }
        int ans = 0;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(isitpossible(board, painters, mid)){
                ans = mid;
                hi = mid -1;
            }
            else{
                lo = mid +1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int [] board, int painters, int mid){
        int no_painters = 1;
        int boardpoint = 0;
        for(int i = 0; i < board.length; i++){
            if(boardpoint + board[i] > mid){
                no_painters++;
                boardpoint = 0;
                
            }
            boardpoint += board[i];
        }
        if(no_painters > painters){
                return false;
            }
        return true;
    }
    public static int max_length(int[] arr){
        int max_length = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            max_length = Math.max(max_length, arr[i]);
        }
        return max_length;
    }
    
}