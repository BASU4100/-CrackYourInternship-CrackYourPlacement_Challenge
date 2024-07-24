class Solution {
    public String addBinary(String a, String b) {
        String res="";
        char carry='0';
        int i=a.length()-1,j=b.length()-1;
        while (i>=0 && j>=0)
        {
            int count=0;
            if (a.charAt(i--)=='1')
                count++;
            if (b.charAt(j--)=='1')
                count++;
            if (carry=='1')
                count++;
            if (count>1)
                carry='1';
            else
                carry='0';
            if (count%2==0)
                res='0'+res;
            else
                res='1'+res;
        }
        if (a.length()==b.length() && carry=='1')
            return '1'+res;
        else if (a.length()==b.length())
            return res;
        a=(a.length()<b.length())?b:a;
        i=(i<0)?j:i;
        while (i>=0 && carry!='0')
        {
            int count=1;
            if (a.charAt(i)=='1')
                count++;
            if (count==2)
                res='0'+res;
            else
                return a.substring(0,i)+'1'+res;
            i--;
        }
        if (i>=0 && carry=='0')
            return a.substring(0,i+1)+res;
        return '1'+res;
    }
}
