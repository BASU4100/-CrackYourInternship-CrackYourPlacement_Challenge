class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int u=nums.length-1;
        if (target<nums[l] && target>nums[u])
            return -1;
        while (l<=u)
        {
            int m=(l+u)/2;
            if (nums[m]==target)
                return m;
            else if (nums[m]>target && target<nums[l])
            {
                if (nums[m]<nums[u])
                    u=m-1;
                else 
                    l=m+1;
            }
            else if (nums[m]>target && target>=nums[l])
            {
                u=m-1;
            }
            else if (nums[m]<target && target>nums[u])
            {
                if (nums[m]>nums[l])
                    l=m+1;
                else
                    u=m-1;
            }
            else 
                l=m+1;
        }
        return -1;
    }
}
