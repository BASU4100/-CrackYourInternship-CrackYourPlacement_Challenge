class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq=new HashMap(){{put(0,1);};};
        int count=0;
        for (int i=1;i<nums.length;i++)
           nums[i]+=nums[i-1];
        for (int i=0;i<nums.length;i++)
        {
            if (freq.containsKey(nums[i]-k))
                count+=freq.get(nums[i]-k);
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        return count;
    }
}
