class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<String> arr = new ArrayList<>();
        for(String s : nums){
            arr.add(s);
        }
        int n = nums[0].length();
        return func(n, "", arr);
    }
    public static String func(int n, String ans, List<String> arr){
        if(ans.length() == n){
            if(!arr.contains(ans)){
                return ans;
            }
            return "";
        }
        String s1 = func(n, ans + "0", arr);
        if(s1 != ""){
            return s1;
        }
        String s2 = func(n, ans + "1", arr);
        return s2;
    }
}