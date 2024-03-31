class Solution {
    public int minSwaps(String s) {
        // Stack<Character> stack = new Stack<Character>();
        int open = 0, close = 0;
        for(char ch : s.toCharArray()){
            if(ch == '['){
                // stack.push(ch);
                open++;
            }
            else if(open > 0){
                // stack.pop();
                open--;
            }
            else{
                // stack.push(ch);
                close++;
            }
        }
        if(open % 2 == 0){
            return open/2;
        }
        return (open + 1)/2;
    }
}