class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a1 = s1.split(" ");
        String[] a2 = s2.split(" ");

        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        for(String s : a1){
            arr1.add(s);
        }
        for(String s : a2){
            arr2.add(s);
        }
        
        List<String> ans = new ArrayList<>();

        for(String s : arr1){
            if(!arr2.contains(s) && countOne(s, arr1)){
                ans.add(s);
            }
        }
        for(String s : arr2){
            if(!arr1.contains(s) && countOne(s, arr2)){
                ans.add(s);
            }
        }

        String[] result = new String[ans.size()];
        int i = 0;
        for(String s : ans){
            result[i] = s;
            i++;
        }
        return result;
    }

    public static boolean countOne(String s, List<String> arr){
        int c = 0;
        for(String str : arr){
            if(str.equals(s)){
                c++;
            }
        }
        return c == 1;
    }
}