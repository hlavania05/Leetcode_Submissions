class Solution {
    public String reverseVowels(String s) {
        return rev_vowel(s);
    }
    public static String rev_vowel(String s){
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            while(i<j && !is_vowel(arr[i])) {
                i++;
            }

            while(i<j && !is_vowel(arr[j])) {
                j--;
            }
            if(i < j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);

    }
    public static boolean is_vowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}