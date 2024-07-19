class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }
        keypad(digits, "", result);
        return result;
    }
    static String[] map = {"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void keypad(String ques, String ans, List<String> result){
        if(ques.length() == 0){
            result.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String press = map[ch - '0'];
        for(int i=0; i<press.length(); i++){
            keypad(ques.substring(1), ans+press.charAt(i), result);
        }
    }
}