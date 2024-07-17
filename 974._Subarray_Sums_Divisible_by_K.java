class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> r=new HashMap(){{put(0,1);}};
        int count=0;
        for (int i=1;i<nums.length;i++)
            nums[i]+=nums[i-1];
        for (int i : nums)
        {
            int abs=(i%k<0)?i%k+k:i%k;
            r.put(abs, r.getOrDefault(abs, 0)+1);
            count+=r.get(abs)-1;
        }
        return count;
    }
}
