class Solution {
    static int cnt = 0;
    public int countArrangement(int n) {
        cnt = 0;
        boolean[] visited = new boolean[n+1];
        count(n, 1, visited);
        return cnt;
    }

    public void count(int n, int pos, boolean[] visited){
        if(pos > n){
            cnt++;
            return;
        }

        for(int i=1; i<=n; i++){
            if(visited[i] == false && (i % pos == 0 || pos % i == 0)){
                visited[i] = true;
                count(n, pos+1, visited);
                visited[i] = false;
            }
        }
    }
}