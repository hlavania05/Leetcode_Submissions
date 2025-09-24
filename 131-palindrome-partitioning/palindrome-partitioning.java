class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        Partitioning(s, ll, result);
        return result;
    }
    public static void Partitioning(String ques, List<String> ll,List<List<String>> result){
        if(ques.length() == 0){
            result.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1; i<=ques.length(); i++){
            String s = ques.substring(0,i);
            if(palindrome(s)){
                ll.add(s);
                Partitioning(ques.substring(i), ll, result);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}