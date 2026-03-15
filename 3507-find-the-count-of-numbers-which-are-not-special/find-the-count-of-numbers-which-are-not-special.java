class Solution {
    public int nonSpecialCount(int l, int r) {

        int start = (int)Math.ceil(Math.sqrt(l));
        int end = (int)Math.floor(Math.sqrt(r));

        int special = cntPrimeNo(start, end);

        return (r - l + 1) - special;
    }

    public int cntPrimeNo(int start, int end){
        int cnt = 0;

        for(int i = start; i <= end; i++){
            if(isPrime(i)){
                cnt++;
            }
        }

        return cnt;
    }

    public boolean isPrime(int n){

        if(n <= 1) return false;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}