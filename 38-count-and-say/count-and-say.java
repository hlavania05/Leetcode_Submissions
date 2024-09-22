class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String s = "1";
        for(int i=1; i<n; i++){
            s = say(s);
        }
        return s;
    }
    public String say(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(count).append(s.charAt(i));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length()-1));
        return sb.toString();
    }
}