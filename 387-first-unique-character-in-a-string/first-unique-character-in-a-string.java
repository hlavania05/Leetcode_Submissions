class Solution {
    public int firstUniqChar(String s) {
        for(char ch : s.toCharArray()){
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);
            if(first == last){
                return first;
            }
        }  
        return -1;
    }
}