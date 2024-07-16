class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int copy=nums[0];
        for (int i=1;i<nums.length;i++)
        {
            if (nums[i]>copy)
            {
                copy=nums[i];
                nums[k]=copy;
                k++;
            }
        }
        return k;
    }
}
