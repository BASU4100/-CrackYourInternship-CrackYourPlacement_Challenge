class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long p=1,count=0;
        long[] arr=new long[n];
        for (int i: nums)
        {
            if (i!=0)
                p*=i;
            else
                count++;
        }
        if (count>1)
            return arr;
        for(int i=0;i<n;i++)
        {
            if (count==1 && nums[i]==0)
                arr[i]=p;
            else if (count==0)
                arr[i]=p/nums[i];
        }
        return arr;
	} 
} 
