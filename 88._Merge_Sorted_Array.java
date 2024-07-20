class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int[] dup=new int[m];
        for (int i=0;i<m;i++)
        {
            dup[i]=nums1[i];
        }
        int l=0;
        int u=0;
        for (int i=0;i<m+n;i++)
        {
            if (l==m)
            {
                nums1[i]=nums2[u];
                u++;
            }
            else if (u==n)
            {
                nums1[i]=dup[l];
                l++;
            }
            else 
            {
                if (dup[l]<=nums2[u])
                {
                    nums1[i]=dup[l];
                    l++;
                }
                else 
                {
                    nums1[i]=nums2[u];
                    u++;
                }
            }
        }
    }
}
