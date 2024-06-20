class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while(a != 0 || b != 0 || c != 0){

            // right bits of a, b and c
            int r1 = a & 1;
            int r2 = b & 1;
            int r3 = c & 1;

            // right bit of c is 1
            if(r3 == 1 && r2 == 0 && r1 == 0){
                flips += 1;
            }

            // right bit of c is 0
            else if(r3 == 0){
                // if(r2 == 1 && r1 == 1){
                //     flips += 2;
                // }
                // else if(r2 == 1 || r1 == 1){
                //     flips += 1;
                // }
                flips += r1 + r2;
            }

            // removing right bit of a, b and c
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return flips;
    }
}