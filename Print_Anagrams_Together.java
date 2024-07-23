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
    public List<List<String>> Anagrams(String[] strs) {
        Map<String, ArrayList<String>> map=new HashMap();
        map.put(strs[0], new ArrayList<String>(){{add(strs[0]);};});
        for (int i=1;i<strs.length;i++)
        {
            int flag=0;
            for (String temp: map.keySet())
            {
                ArrayList<String> list=map.get(temp);
                if (temp.length()==strs[i].length() && (list.contains(strs[i]) || isAnagram(temp, strs[i])))
                {
                    list.add(strs[i]);
                    flag=1;
                    break;
                }                
            }
            if (flag==0)
            {
                List<String> temp=new ArrayList();
                temp.add(strs[i]);
                map.put(strs[i], (ArrayList)temp);
            }
        }
        return new ArrayList(map.values());
    }
}
