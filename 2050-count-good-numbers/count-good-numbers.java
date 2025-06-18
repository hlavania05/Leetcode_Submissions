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
        long result = 1;
        a = a % MOD;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b = b / 2;
        }
        return result;
    }
}
