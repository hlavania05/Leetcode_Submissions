class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<>();
        long ans = 1;
        lst.add((int)ans);
        for (int i = 0; i < rowIndex; i++) { // Change here: use <= rowIndex
            ans = ans * (rowIndex - i); // Change to (rowIndex - i + 1)
            ans = ans / (i+1); // This remains the same
            lst.add((int)ans);
        }
        return lst;

    }
}