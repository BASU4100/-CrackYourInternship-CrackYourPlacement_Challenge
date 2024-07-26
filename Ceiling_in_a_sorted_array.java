class Solution {
      public void floorCeil(int x, int[] arr) {
            int l=0,u=arr.length-1;
            while (l<=u)
            {
                int m=(l+u)/2;
                if (arr[m]==x)
                {
                    System.out.println ("floor = "+ x);
                    System.out.println ("ceiling = "+ x);
                    return;
                }
                else if (arr[m]>x)
                    u=m-1;
                else
                    l=m+1;
            }
            if (u>-1)
                System.out.println("floor = "+arr[u]);
            else
                System.out.println("floor doesn't exist.");
            if (l<arr.length)
                System.out.println("ceiling = "+arr[l]);
            else
                System.out.println("ceiling doesn't exist.");
      }
}
