class Solution {
    public boolean exist(char[][] board, String word) {
      int n = board.length, m = board[0].length;
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(board[i][j] == word.charAt(0)){
                    if(backtrack(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board, String word, int i, int j, int idx){
            if(idx == word.length()){
                return true;
            }
             if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != word.charAt(idx)){
                return false;
            }
            char temp = board[i][j];
            board[i][j] = '#';
            boolean found = backtrack(board,word,i+1,j,idx+1) 
            || backtrack(board,word,i-1,j,idx+1) 
            || backtrack(board,word,i,j-1,idx+1) 
            || backtrack(board,word,i,j+1,idx+1);
            board[i][j] = temp;
            return found;
    }
}