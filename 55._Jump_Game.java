class Solution {
    public boolean canJump(int[] nums) {
        int reachable=nums.length-1;
        for (int i=reachable-1;i>=0;i--)
            if (nums[i]>=reachable-i)
                reachable=i;
        if (reachable==0)
            return true;
        else return false;
    }
}
