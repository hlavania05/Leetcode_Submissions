import java.util.*;

class Fancy {

    long mod = 1000000007;
    List<Long> arr;
    long mul = 1;
    long add = 0;

    public Fancy() {
        arr = new ArrayList<>();
    }

    public void append(int val) {
        long inv = modInverse(mul);
        long stored = ((val - add + mod) % mod * inv) % mod;
        arr.add(stored);
    }

    public void addAll(int inc) {
        add = (add + inc) % mod;
    }

    public void multAll(int m) {
        mul = (mul * m) % mod;
        add = (add * m) % mod;
    }

    public int getIndex(int idx) {
        if(idx >= arr.size()) return -1;

        long val = (arr.get(idx) * mul % mod + add) % mod;
        return (int) val;
    }

    private long modInverse(long x) {
        return power(x, mod - 2);
    }

    private long power(long x, long y) {
        long res = 1;
        x %= mod;

        while(y > 0){
            if((y & 1) == 1) res = (res * x) % mod;
            x = (x * x) % mod;
            y >>= 1;
        }

        return res;
    }
}