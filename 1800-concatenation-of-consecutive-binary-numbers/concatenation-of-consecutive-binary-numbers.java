class Solution {
    public int concatenatedBinary(int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(Integer.toBinaryString(i));
        }

        return binToDec(sb.toString());
    }

    public int binToDec(String s) {
        long result = 0;
        int MOD = 1000000007;

        for (int i = 0; i < s.length(); i++) {
            result = (result * 2 + (s.charAt(i) - '0')) % MOD;
        }

        return (int) result;
    }
}