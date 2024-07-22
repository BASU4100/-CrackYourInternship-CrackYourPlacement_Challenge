class Solution {
    public boolean helper(String s, int i, int j)
    {
        while (i<j)
        {
            if (s.charAt(i)==s.charAt(j))
            {
                i++;j--;
            }
            else
                return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while (i<j)
        {
            if (s.charAt(i)==s.charAt(j))
            {
                i++;j--;
            }
            else
                break;
        }
        return (helper(s,i,j-1) || helper(s, i+1,j));
    }
}
