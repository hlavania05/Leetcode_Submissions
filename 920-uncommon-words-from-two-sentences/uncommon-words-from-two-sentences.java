class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Converting string to arr
        String[] a1 = s1.split(" ");
        String[] a2 = s2.split(" ");

        // Converting arr to List
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        for(String s : a1){
            arr1.add(s);
        }
        for(String s : a2){
            arr2.add(s);
        }
        
        // Initializing ans List
        List<String> ans = new ArrayList<>();

        // Checking Uncommon Words from two sentences
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

        // Converting Ans List into String Array
        String[] result = new String[ans.size()];
        int i = 0;
        for(String s : ans){
            result[i] = s;
            i++;
        }
        return result;
    }

    // This method will check the occurence of word in a arrlist
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