class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] freq=new int[nums.length];
        List<Integer> sol=new ArrayList();
        for (int i:nums)
            freq[i-1]++;
        for (int i=0;i<nums.length;i++)
        {
            if (freq[i]>1)
                sol.add(i+1);
        }
        return sol;
    }
}
