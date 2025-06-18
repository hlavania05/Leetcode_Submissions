class Solution {
    public int lastRemaining(int n) {
        int head = 1;
        int remain = n;
        int step = 1;
        boolean isLeft = true;
        while(remain > 1){
            if(isLeft || remain % 2 != 0){
                head = head + step;
            }
            remain = remain/2;
            step = step * 2;
            isLeft = !isLeft;
        }
        return head;
    }
}