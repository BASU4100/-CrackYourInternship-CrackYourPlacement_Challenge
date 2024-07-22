class Solution {
    public int calculate(String s) {
        s=s.replace(" ","");
        Stack<Integer> st=new Stack();
        Stack<Character> op=new Stack();
        String num="";
        for (char ch: s.toCharArray())
        {
            if (Character.isDigit(ch))
                num+=ch+"";
            else
            {
                if (!op.empty() && op.peek()=='*')
                {
                    op.pop();
                    st.push(st.pop()*Integer.parseInt(num));
                }
                else if (!op.empty() && op.peek()=='/')
                {
                    op.pop();
                    st.push(st.pop()/Integer.parseInt(num));
                }
                else
                    st.push(Integer.parseInt(num));
                op.push(ch);
                num="";
            }
        }
        if (!op.empty() && op.peek()=='*')
        {
            op.pop();
            st.push(st.pop()*Integer.parseInt(num));
        }
        else if(!op.empty() && op.peek()=='/')
        {
            op.pop();
            st.push(st.pop()/Integer.parseInt(num));
        }
        else
            st.push(Integer.parseInt(num));
        int i=0;
        int n=st.get(i);
        while (i<op.size())
        {
            if (op.get(i)=='+')
                n=n+st.get(i+1);
            else
                n=n-st.get(i+1);
            i++;
        }
        return n;
    }
}
