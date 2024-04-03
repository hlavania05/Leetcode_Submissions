class Solution {
    public boolean exist(char[][] board, String word) {
        return func(board, word);
    }
    public boolean func(char[][] board, String str){
        if(board == null || board.length == 0 || str.length()==0 || str == null){
            return false;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(search(board, str, visited, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(char[][] board, String word, boolean[][] visited, int cr, int cc, int i){
        if(i == word.length()){
            return true;
        }
        if(cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || visited[cr][cc] || board[cr][cc] != word.charAt(i)){
            return false;
        }
        visited[cr][cc] = true;
        boolean ans = (
            search(board, word, visited, cr+1, cc, i+1) ||
            search(board, word, visited, cr, cc+1, i+1) || 
            search(board, word, visited, cr-1, cc, i+1) || 
            search(board, word, visited, cr, cc-1, i+1)
        );
        visited[cr][cc] = false;
        return ans;
    }
}