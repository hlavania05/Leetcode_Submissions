class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        int n = coordinates.charAt(1);
        if(n % 2 == 0 && ch % 2 == 1 || n % 2 == 1 && ch % 2 == 0){
            return true;
        }
        return false;
    }
}