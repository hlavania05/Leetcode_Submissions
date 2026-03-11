class Solution {
    public int bitwiseComplement(int n) {
        int mask = 1;
        while(mask < n){
            mask = mask << 1;
            mask = mask | 1;
        }
        return mask^n;
    }
}