class Solution {
    public int maxArea(int[] height) {
        int l=0,u=height.length-1;
        int max=0;
        while (l<u)
        {
            if (max<(u-l)*Math.min(height[l],height[u]))
                max=(u-l)*Math.min(height[l],height[u]);
            if (height[l]<=height[u])
                l++;
            else u--;
        }
        return max;
    }
}
