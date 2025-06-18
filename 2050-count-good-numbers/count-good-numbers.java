class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenPos = (n + 1) / 2;
        long oddPos = n / 2;

        long a = power(5, evenPos);
        long b = power(4, oddPos);

        return (int)((a * b) % MOD);
    }

    public long power(long a, long b) {
        if (b == 0) return 1;

        long half = power(a, b / 2);
        long result = (half * half) % MOD;

        if (b % 2 == 1) {
            result = (result * a) % MOD;
        }

        return result;
    }
}
