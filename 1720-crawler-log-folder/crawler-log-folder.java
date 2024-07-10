class Solution {
    public int minOperations(String[] logs) {
        int cnt1 = 0;
        for(String item : logs){
            if(item.equals("../")){
                if(cnt1 > 0){
                    cnt1--;
                }
            }
            else if(item.equals("./")){
                continue;
            }
            else{
                cnt1++;
            }
       }
        return (cnt1 > 0) ? cnt1 : 0;
    }
}