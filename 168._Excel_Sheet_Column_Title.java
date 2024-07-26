class Solution {
    public String convertToTitle(int columnNumber) {
        String str="";
        ArrayList<Integer> temp=new ArrayList<Integer>();
        while (columnNumber!=0)
        {
            temp.add(columnNumber%26);
            columnNumber/=26;
        }
        for (int i=0;i<temp.size();i++)
        {
            if (temp.get(i)<=0 && i+1<temp.size())
            {
                temp.set(i,26+temp.get(i));
                temp.set(i+1,temp.get(i+1)-1);
            }
            if (temp.get(i)!=0)
                str=Character.toString(temp.get(i)+64)+str;
        }
        return str;
    }
}
