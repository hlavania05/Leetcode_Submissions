class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        return NoOfVowelStrings(words, queries);
    }
    public static int[] NoOfVowelStrings(String[] arr, int[][] queries){
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int[] prefixSum = new int[arr.length];
        prefixSum[0] = startAndEndwithVowel(arr[0], vowels) ? 1 : 0;

        for(int i=1; i< arr.length; i++){
            if(startAndEndwithVowel(arr[i] , vowels)){
                prefixSum[i] = prefixSum[i-1] + 1;
            }
            else{
                prefixSum[i] = prefixSum[i-1];
            }
        }
        int[] ans = new int[queries.length];
        int k = 0;
        for(int[] query : queries){
            int i = query[0];
            int j = query[1];
            ans[k] = (i==0) ? prefixSum[j] : prefixSum[j]-prefixSum[i-1];
            k++;
        }
        return ans;

    }

    public static boolean startAndEndwithVowel(String wrd, List<Character> vowels){
        return vowels.contains(wrd.charAt(0)) && vowels.contains(wrd.charAt(wrd.length() - 1));
    }
}