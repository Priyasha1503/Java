#https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        for(int a=0;a<s.length();a++)
        {
            char i=s.charAt(a);
            if(i=='(' || i=='{' ||i=='[')
            stack.add(i);
            else
            {
                if(!stack.isEmpty())
                {
                    char x=stack.pop();
                    if((x=='(' && i==')') || (x=='[' && i==']') || x=='{' && i=='}')
                    {
                        //empty block instead of pass statement
                    }
                    else
                    return false;

                }
                else
                return false;
            }
        }
        if(stack.isEmpty())
        return true;
        else
        return false;
    }
}
