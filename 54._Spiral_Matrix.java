class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sol=new ArrayList();
        int tl=0,bl=matrix.length,rl=matrix[0].length,ll=0;
        char di='R';
        int i=0,j=0;
        while (tl!=bl && rl!=ll)
        {
            switch (di){
            case 'R':   while (j<rl)
                            sol.add(matrix[i][j++]);
                        j--;i++;
                        tl++;
                        di='D';
                        break;
            case 'L':   while (j>=ll)
                            sol.add(matrix[i][j--]);
                        j++;i--;
                        bl--;
                        di='U';
                        break;
            case 'U':   while (i>=tl)
                            sol.add(matrix[i--][j]);
                        i++;j++;
                        ll++;
                        di='R';
                        break;
            case 'D':   while (i<bl)
                            sol.add(matrix[i++][j]);
                        i--;j--;
                        rl--;
                        di='L';
                        break;
            }
        }
        return sol;
    }
}
