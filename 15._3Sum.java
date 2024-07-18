class Solution {
    List<List<Integer>> sol;

    public void twoSum(int[] nums, int l, int target, int initial)
    {
        l=l+1;
        Set<Integer> set=new HashSet();
        while (l<nums.length)
        {
            if (set.contains(target-nums[l]))
            {
                sol.add(Arrays.asList(initial, target-nums[l], nums[l]));
                set.remove(target-nums[l]);
                set.remove(nums[l]);
                l++;
                while (l<nums.length && nums[l]==nums[l-1])
                    l++;
                continue;
            }
            else
                set.add(nums[l]);
            l++;
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        sol=new ArrayList();
        for (int i=0;i<nums.length-2;i++)
        {
            if (nums[i]>0)
                return sol;
            else if (i==0 || nums[i]!=nums[i-1])
                twoSum(nums, i, 0-nums[i], nums[i]);
        }
        return sol;
    }
}
