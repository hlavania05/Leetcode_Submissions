class Solution {
    public double averageWaitingTime(int[][] customers) {
        long avg_time = 0;
        long time = customers[0][0];
        for(int[] arr : customers){
            if(time < arr[0]){
                time = arr[0];
            }
            time += arr[1];
            avg_time += (time - arr[0]);
        }
        return (double)(avg_time)/(double)customers.length;
    }
}