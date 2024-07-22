class Solution {
    public String simplifyPath(String path) {
        String[] files=path.split("/");
        Stack<String> st=new Stack();
        for (String i: files)
        {
            if (i.equals("..") && !st.empty())
                st.pop();
            else if (!i.equals(".") && !i.equals("") && !i.equals(".."))
                st.push(i);
        }
        path="";
        while (!st.empty())
            path="/"+st.pop()+path;
        if (path.length()==0)
            path="/";
        return path;
    }
}
