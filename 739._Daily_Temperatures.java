class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp=new Stack();
        int[] ans=new int[temperatures.length];
        for (int i=ans.length-1;i>=0;i--)
        {
            while (!temp.empty() && temperatures[temp.peek()]<=temperatures[i])
                temp.pop();
            if (temp.empty())
            {
                temp.push(i);
                ans[i]=0;
            }
            else
            {
                ans[i]=temp.peek()-i;
                temp.push(i);
            }
        }
        return ans;
    }
}
