class Solution {
    public int timeRequiredToBuy(int[] v, int k) {
        int n = v.length;
        int t = 0;
        while (true) {
            for (int i = 0; i < n; i++) {
                if (v[i] > 0) {
                    v[i] = v[i] - 1;
                    t++;
                }
                if (i == k && v[i] == 0)
                    return t;
            }
        }
    }
}