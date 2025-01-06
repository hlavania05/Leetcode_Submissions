class Solution {
    public int[] minOperations(String boxes) {
        int n= boxes.length();
        int[] pref1= new int[n];
        int[] suf1= new int[n];
        int[] prefsteps=new int[n];
        int[] sufsteps=new int[n];
        prefsteps[0]=0;
        sufsteps[n-1]=0;
        pref1[0]=0;
        suf1[n-1]=0;
        for(int i=1;i<n;++i){ 
            if(boxes.charAt(i-1)=='1') {
                pref1[i]=pref1[i-1]+1;
            }else pref1[i]=pref1[i-1];
        }
        for(int i=n-2;i>=0;--i){
            if(boxes.charAt(i+1)=='1') suf1[i]=suf1[i+1]+1;
            else suf1[i]=suf1[i+1];
        }   
        for(int i=1;i<n;++i){
            int ans=prefsteps[i-1]+pref1[i-1];
            if(boxes.charAt(i-1)=='1') ans++;
            prefsteps[i]=ans;
        }
        for(int i=n-2;i>=0;--i){
            int ans= sufsteps[i+1]+suf1[i+1];
            if(boxes.charAt(i+1)=='1') ans++;
            sufsteps[i]=ans;
        } 
        for(int i=0;i<n;++i){
            pref1[i]=prefsteps[i]+sufsteps[i];
        }
        return pref1;
    }
}