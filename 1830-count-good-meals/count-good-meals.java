import java.util.*;

class Solution {
    public int countPairs(int[] deliciousness) {
        long MOD = 1_000_000_007;
        Map<Integer, Integer> map = new HashMap<>();
        long count = 0;

        for (int val : deliciousness) {
            int power = 1;

            // Check all powers of 2 upto 2^21
            for (int i = 0; i <= 21; i++) {
                int complement = power - val;
                if (map.containsKey(complement)) {
                    count = (count + map.get(complement)) % MOD;
                }
                power <<= 1;
            }

            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        return (int) count;
    }
}