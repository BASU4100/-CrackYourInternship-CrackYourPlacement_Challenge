class Solution {
    boolean[][] used;
    public boolean check(char[][] board, String word, int i, int j, int ch)
    {
        if (ch==word.length())
            return true;
        if (i<0 || j<0 || i==board.length || j==board[0].length || used[i][j] || 
        board[i][j]!=word.charAt(ch))
             return false;
        used[i][j]=true;
        boolean comp = (check(board,word,i-1,j,ch+1) || check(board,word,i+1,j,ch+1) || 
        check(board,word,i,j+1,ch+1) || check(board,word,i,j-1,ch+1));
        used[i][j]=false;
        return comp;
    }
    public boolean exist(char[][] board, String word) {
        int row=board.length,col=board[0].length;
        used=new boolean[row][col];
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++)
                if (check(board,word,i,j,0))
                    return true;
        
        return false;
    }
}
