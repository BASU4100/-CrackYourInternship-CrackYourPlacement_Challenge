class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> ih=new Stack<>();
        ih.push(new int[]{0,heights[0]});
        int max=0;
        for (int i=1;i<heights.length;i++)
        {
            if (heights[i]>=ih.peek()[1])
                ih.push(new int[]{i,heights[i]});
            else
            {
                int index=0;
                while (!ih.empty() && ih.peek()[1]>heights[i])
                {
                    if (max<(i-ih.peek()[0])*ih.peek()[1])
                        max=(i-ih.peek()[0])*ih.peek()[1];
                    index=ih.pop()[0];
                }
                ih.push(new int[]{index,heights[i]});
            }
        }
        while(!ih.empty())
        {
            if (max<(heights.length-ih.peek()[0])*ih.peek()[1])
                max=(heights.length-ih.peek()[0])*ih.peek()[1];
            ih.pop();
        }
        return max;
    }
}
