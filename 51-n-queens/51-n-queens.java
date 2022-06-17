class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> answers = new ArrayList<>();
        queens(board,0,answers);
        return answers;
    }
    
    void queens(boolean[][] board,int row,List<List<String>> answers){

        if (row == board.length){
            answers.add(display(board));
            return;
        }

        int count = 0;

        for (int col=0;col< board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                queens(board,row+1,answers);
                board[row][col] = false;
            }
        }
    }

    boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        // check diagonal left

        int maxLeft = Math.min(row,col);
        for (int i = 1; i <=maxLeft ; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }

        // check diagonal right

        int maxRight = Math.min(row,board.length-col-1);
        for (int i = 1; i <=maxRight ; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    List<String> display(boolean[][] board) {
        List<String> ans = new ArrayList<>();
        for (boolean[] row : board){
            String list = "";
            for (boolean element : row){
                if (element){
                    list += "Q";
                }
                else {
                    list += ".";
                }
            }
            ans.add(list);
        }
        return ans;
    }
    
    
}