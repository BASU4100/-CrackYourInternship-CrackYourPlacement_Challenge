class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i=0,max=0,j=0;
        while (i!=nums.length)
        {
            if (nums[i]!=nums[j])
            {
                max=i-j;
                if (max>(int)nums.length/2)
                    break;
                j=i;
            }
            i++;
        }
        return nums[j];
    }
}
