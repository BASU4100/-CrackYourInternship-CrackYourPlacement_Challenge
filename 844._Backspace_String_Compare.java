class Solution {
    public String transform(String str)
    {
        StringBuilder temp=new StringBuilder();
        for (char ch :str.toCharArray())
        {
            if (ch=='#' && temp.length()!=0)
                temp.delete(temp.length()-1,temp.length());
            else if (ch!='#')
                temp.append(ch);
        }
        return temp.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        s=transform(s);
        t=transform(t);
        return s.equals(t);        
    }
}
