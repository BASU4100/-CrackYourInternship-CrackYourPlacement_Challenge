class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        if (len==3)
            return nums[len-1]*nums[len-2]*nums[len-3];
        return Math.max(Math.max(nums[len-2]*nums[len-3]*nums[len-4],nums[len-1]*nums[0]*nums[1]),
                            nums[len-1]*nums[len-2]*nums[len-3]);
    }
}
