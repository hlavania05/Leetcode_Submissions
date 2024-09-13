class Solution {
    public List<List<Integer>> generate(int numRows) {
        return Pascal_triangle(numRows);
    }
    public static List<List<Integer>> Pascal_triangle(int n){
        ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
        int rows = 0;
        int column = 1;
        while(rows<n){
            List<Integer> arr2 = new ArrayList<>();
            for(int j=0; j<column; j++){
                if(j==0 || j==column-1){
                    arr2.add(1);
                }
                else{
                    int temp = arr.get(rows - 1).get(j - 1) + arr.get(rows - 1).get(j);
                    arr2.add(temp); 
                }
            }
            arr.add(arr2);
            rows++;
            column++;
        }
        return arr;
    }
}