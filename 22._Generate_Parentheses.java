class Solution {
    List<String> sol;
    public void helper(String p, int close, int open)
    {
        if (close==0 && open==0)
        {
            sol.add(p);
            return;
        }
        if (close>0)
            helper(p+'(', close-1, open+1);
        if (open>0)
            helper(p+')', close, open-1);
    }
    public List<String> generateParenthesis(int n) {
        sol=new ArrayList();
        helper("", n, 0);
        return sol;
    }
}
