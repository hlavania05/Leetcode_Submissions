class coordinates implements Comparable<coordinates>{
    int x;
    int y;
    int dist;
    public coordinates(int x, int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
    public int compareTo(coordinates other){
        return Integer.compare(other.dist, this.dist);
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<coordinates> maxHeap = new PriorityQueue<coordinates>();
        for(int[] point : points){
            int x = point[0];
            int y = point[1];
            int dis = distance(x, y);
            maxHeap.add(new coordinates(x, y, dis));
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int[][] ans = new int[k][2];
        for(int i=k-1; i>=0; i--){
            coordinates coord = maxHeap.poll();
            if (coord != null) {
                ans[i][0] = coord.x;
                ans[i][1] = coord.y;
            }
        }
        return ans;

    }
    public static int distance(int x, int y){
        return (x*x + y*y);
    }
}
