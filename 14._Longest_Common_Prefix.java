class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sol="";
        int flag=0;
        for (int j=0;j<strs[0].length();j++)
        {
            for (int k=0;k<strs.length;k++)
            {
                if (strs[k].startsWith(strs[0].substring(0,j+1)))
                {
                    flag=1;
                    continue;
                }
                else
                {
                    flag=0;
                    break;
                }    
            }
            if (flag==1)
                sol=sol+strs[0].charAt(j);
            else
                break;
        }
        return sol;
    }
}
