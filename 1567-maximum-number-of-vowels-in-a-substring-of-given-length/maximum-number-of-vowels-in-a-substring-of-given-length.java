class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int l = 0;
        int vowel = 0;
        int r = 0;
        int maxVo = 0;
        while(r < k){
            char ch = s.charAt(r);
            if(vowels.indexOf(ch) != -1){
                vowel++;
            }
            maxVo = Math.max(maxVo, vowel);
            r++;
        }

        while(r < s.length()){
            char left = s.charAt(l);
            if(vowels.indexOf(left) != -1){
                vowel--;
            }
            l++;

            char right = s.charAt(r);
            if(vowels.indexOf(right) != -1){
                vowel++;
            }
            r++;

            maxVo = Math.max(maxVo, vowel);
        }
        return maxVo;
    }
}