class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        String temp = "";
        for(String s : words){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String curr = new String(arr);
            if(!curr.equals(temp)){
                ans.add(s);
            }
            temp = curr;  
        }
        return ans;
    }
}