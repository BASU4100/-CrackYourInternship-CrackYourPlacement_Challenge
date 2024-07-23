class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l=0,u=nums.length-1,moves=0;
        while (l<u)
            moves+=nums[u--]-nums[l++];
        return moves;
    }
}
