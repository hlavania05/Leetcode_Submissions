class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // 1. Add all intervals ending before the new interval starts
        while (i < n && intervals[i][1] < newInterval[0]) { 
            result.add(intervals[i]);
            i++;
        }

        // 2. Merge all overlapping intervals into the new interval
        while (i < n && intervals[i][0] <= newInterval[1]) { 
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        // Add the merged interval
        result.add(newInterval);

        // 3. Add all the remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        // Convert the result list to a 2D array
        return result.toArray(new int[result.size()][]);
    }
}
