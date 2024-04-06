class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(a[1], b[1]));
        int max_units = 0;
        for(int i=boxTypes.length-1; i>=0; i--){
            int a = boxTypes[i][0];
            int b = boxTypes[i][1];
            if(truckSize >= a){
                max_units += a * b; 
                truckSize -= a;
            }
            else{
                max_units += truckSize * b;
                truckSize -= truckSize;
            }
        }
        return max_units;
    }
}