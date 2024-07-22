class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split(" ");
        s="";
        for (String str:words)
        {
            if (str!="")
                if (s.length()!=0)
                    s=str+" "+s;  
                else
                    s=str;
        }
        return s;
    }
}
