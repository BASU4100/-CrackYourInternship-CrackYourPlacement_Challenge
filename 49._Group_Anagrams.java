class Solution {
    public boolean isAnagram(String str1,String str2)
    {
        int[] c=new int[26];
        for (char ch:str1.toCharArray())
            c[ch-'a']+=1;
        for (char ch:str2.toCharArray())
        {
            c[ch-'a']-=1;
            if (c[ch-'a']<0)
                return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> element=new ArrayList(){{add(strs[0]);}};
        List<List<String>> sol=new ArrayList(){{add(element);}};
        for (int i=1;i<strs.length;i++)
        {
            int t=0;
            while (t<sol.size())
            {
                String str=sol.get(t).get(0);
                if (strs[i].length()==str.length() && isAnagram(strs[i],str))
                {
                    sol.get(t).add(strs[i]);
                    break;
                }
                else t++;
            }
            if (t==sol.size())
            {
                sol.add(new ArrayList<String>());
                sol.get(t).add(strs[i]);
            }       
        }
        return sol;
    }
}
