class Solution {
    public String largestNumber(int[] nums) {
        return form_large_num(nums);
    }
    public String form_large_num(int[] arr){
        String[] str_arr = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            str_arr[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(str_arr, (a, b) -> (b + a).compareTo(a + b));
        if(str_arr[0].equals("0")){
            return "0";
        }
        String str = "";
        for(String s : str_arr){
            str += s;
        }
        return str;
    }
}