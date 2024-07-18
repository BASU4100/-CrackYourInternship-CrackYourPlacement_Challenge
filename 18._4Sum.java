class Solution {
    List<List<Integer>> sol;

    public void twoSum(int[] nums, int start, long target, List<Integer> initial)
    {
        start+=1;
        int end=nums.length-1;
        while(start<end)
        {
            if (nums[start]+nums[end]<target)
                start++;
            else if (nums[start]+nums[end]>target)
                end--;
            else
            {
                List<Integer> temp=Arrays.asList(initial.get(0), initial.get(1), nums[start], nums[end]);
                sol.add(temp);
                start++;
                end--;
                while (start<end && nums[start]==nums[start-1])
                    start++;
                while (start<end && nums[end]==nums[end+1])
                    end--;
            }
        }
    }

    public void threeSum(int[] nums, int start, long target, int initial)
    {
        for (int i=start+1;i<nums.length-2;i++)
        {
            if ((target<=0 && nums[i]>0) || (target>0 && nums[i]>target))
                return;
            if (i==start+1 || nums[i]!=nums[i-1])
                twoSum(nums, i, target-nums[i], Arrays.asList(initial, nums[i]));
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        sol=new ArrayList();
        for (int i=0;i<nums.length-3;i++)
        {
            if ((target<=0 && nums[i]>0) || (target>0 && nums[i]>target))
                return sol;
            if (i==0 || nums[i]!=nums[i-1])
                threeSum(nums, i, target-nums[i], nums[i]);
        }
        return sol;
    }
}
