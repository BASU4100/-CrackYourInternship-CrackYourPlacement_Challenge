class Solution {
    public void gameOfLife(int[][] board) {
        int row=board.length,col=board[0].length;
        boolean[][] alive=new boolean[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                int count=0;
                if (i!=0)
                {
                    if (j!=0 && board[i-1][j-1]==1)
                        count++;
                    if (board[i-1][j]==1)
                        count++;
                    if (j!=col-1 && board[i-1][j+1]==1)
                        count++;
                }
                if (i!=row-1)
                {
                    if (j!=0 && board[i+1][j-1]==1)
                        count++;
                    if (board[i+1][j]==1)
                        count++;
                    if (j!=col-1 && board[i+1][j+1]==1)
                        count++;
                }
                if (j!=0 && board[i][j-1]==1)
                    count++;
                if (j!=col-1 && board[i][j+1]==1)
                    count++;
                if ((board[i][j]==1 && (count==2 || count==3)) || (board[i][j]==0 && count==3))
                    alive[i][j]=true;
            }
        }
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if (alive[i][j])
                    board[i][j]=1;
                else
                    board[i][j]=0;
            }
        }
    }
}
