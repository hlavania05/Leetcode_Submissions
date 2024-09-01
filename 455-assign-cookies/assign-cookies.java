class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        return func(g, s);
    }
    public static int func(int[] g, int[] s){
        int i = 0;
        int j = 0;
        int count = 0;
        while(j<s.length && i<g.length){
            if(s[j] >= g[i]){
                j++;
                i++;
                count++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}