class Solution {
    boolean[][] visited;
    int row,col;
    public void expand(char[][] grid, int i, int j)
    {
        visited[i][j]=true;
        if (i!=0 && visited[i-1][j]!=true && grid[i-1][j]=='1')
            expand(grid, i-1, j);
        if (i!=row-1 && visited[i+1][j]!=true && grid[i+1][j]=='1')
            expand(grid, i+1, j);
        if (j!=0 && visited[i][j-1]!=true && grid[i][j-1]=='1')
            expand(grid, i, j-1);
        if (j!=col-1 && visited[i][j+1]!=true && grid[i][j+1]=='1')
            expand(grid, i, j+1);
    }

    public int numIslands(char[][] grid) {
        row=grid.length;col=grid[0].length;
        int count=0;
        visited=new boolean[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if (visited[i][j]!=true && grid[i][j]=='1')
                {
                    count++;
                    expand(grid, i, j);
                }
                visited[i][j]=true;
            }
        }
        return count;
    }
}
