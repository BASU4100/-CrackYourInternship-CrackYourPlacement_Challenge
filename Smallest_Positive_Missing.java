class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        Set<Integer> visited=new HashSet();
        int smallest=1;
        for (int i:arr)
        {
            if (visited.contains(smallest))
                smallest++;
            if (i==smallest)
                smallest++;
            else if (i>smallest)
                visited.add(i);
        }
        while (visited.contains(smallest))
            smallest++;
        return smallest;
    }
}
