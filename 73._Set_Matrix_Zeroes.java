class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row=new int[matrix.length];
        int[] col=new int[matrix[0].length];
        for (int i=0;i<row.length;i++)
        {
            for (int j=0;j<col.length;j++)
            {
                if (matrix[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for (int i=0;i<row.length;i++)
        {
            if (row[i]==1)
            {
                for (int j=0;j<col.length;j++)
                    matrix[i][j]=0;
            }
            else
            {
                for (int j=0;j<col.length;j++)
                {
                    if (col[j]==1)
                        matrix[i][j]=0;
                }
            }
        }
    }
}
