class pair implements Comparable<pair>  {
    int rowIndex;
    int countOne;

    public pair(int a, int b){
        this.rowIndex = a;
        this.countOne = b;
    }

    @Override
    public int compareTo(pair other){
        if(this.countOne != other.countOne){
            return this.countOne - other.countOne;
        }
        return this.rowIndex - other.rowIndex;
    }
    @Override
    public String toString(){
        return rowIndex + " = " + countOne;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] matrix, int k) {
        // store the row index and corresponding no of ones in that row
        HashMap<Integer, Integer> map = new HashMap<>();  // <rowIndex, noOfOnes>
        for(int i=0; i<matrix.length; i++){
            map.put(i, countOnes(matrix[i]));
        }

        // maintain a maxHeap of size k which will have the weakest two row index and correspoind noOfOnes
        PriorityQueue<pair> maxHeap = new PriorityQueue<pair>(Collections.reverseOrder());
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            maxHeap.add(new pair(e.getKey(), e.getValue()));
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int[] ans = new int[k];
        int idx = k-1;
        while(maxHeap.size() != 0){
            ans[idx] = maxHeap.poll().rowIndex;
            idx--;
        }
        return ans;
 
    }
    public static int countOnes(int[] arr){
        int cnt = 0;
        for(int item : arr){
            cnt += item;
        }
        return cnt;
    }
}