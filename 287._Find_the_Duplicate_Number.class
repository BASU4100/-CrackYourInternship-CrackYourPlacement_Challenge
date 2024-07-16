class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer , Integer> freq=new HashMap();
        for (int i: nums)
        {
            if (freq.containsKey(i))
                return i;
            freq.put(i, 1);
        }
        return 0;
    }
}
