import java.util.PriorityQueue;

class Coordinates implements Comparable<Coordinates> {
    int x;
    int y;
    int distSquared;

    public Coordinates(int x, int y, int distSquared) {
        this.x = x;
        this.y = y;
        this.distSquared = distSquared;
    }

    @Override
    public int compareTo(Coordinates other) {
        return Integer.compare(other.distSquared, this.distSquared); // Max-heap behavior
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Coordinates> maxHeap = new PriorityQueue<>();
        
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int distSquared = distanceSquared(x, y); // Use squared distance to avoid floating-point inaccuracies
            maxHeap.add(new Coordinates(x, y, distSquared));
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] ans = new int[k][2];
        for (int i = k - 1; i >= 0; i--) {
            Coordinates coord = maxHeap.poll();
            if (coord != null) {
                ans[i][0] = coord.x;
                ans[i][1] = coord.y;
            }
        }
        
        return ans;
    }

    // Method to calculate squared distance
    private static int distanceSquared(int x, int y) {
        return x * x + y * y;
    }
}
