class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long min=Integer.MAX_VALUE;
        int l=0,u=m-1;
        while (u<n)
        {
            if ((a.get(u)-a.get(l))<min)
                min=a.get(u)-a.get(l);
            l++;u++;
        }
        return min;
    }
}
