class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesis=new Stack();
        for (char ch: s.toCharArray())
        {
            if (ch=='(' || ch=='{' || ch=='[')
                parenthesis.push(ch);
            else if (!parenthesis.empty())
            {
                if (ch==')' && parenthesis.pop()!='(')
                    return false;
                else if (ch=='}' && parenthesis.pop()!='{')
                    return false;
                else if (ch==']' && parenthesis.pop()!='[')
                    return false;
            }
            else
                return false;
        }
        return parenthesis.empty();
    }
}
