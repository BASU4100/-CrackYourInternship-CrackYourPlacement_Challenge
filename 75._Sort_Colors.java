class Solution {
    public void sortColors(int[] nums) {
        int[] freq=new int[3];
        for (int i: nums)
            freq[i]++;
        int k=0;
        for (int i=0;i<freq.length;i++)
        {
            while (freq[i]>0)
            {
                nums[k++]=i;
                freq[i]--;
            }
        }
    }
}
