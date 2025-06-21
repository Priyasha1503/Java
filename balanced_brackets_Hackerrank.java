//BALANCED BRACKETS-MIGHT CONTAIN ERRORS-USING SWITCH CASE..
//https://www.hackerrank.com/challenges/balanced-brackets/problem?isFullScreen=true


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size=Integer.parseInt(sc.nextLine());
        for(int i=0;i<size;i++)
        {
            //char[] str = new char[size];//creates character array
            char[] str = sc.nextLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            for(int j=0;j<str.length;j++)
            {
                //if string is empty
                if(stack.size>str.length-j)
                {
                    result="NO_ELEMENT";
                    
                }
                switch(str[j])
                {
                    case '(':
                    case '{':
                    case '[':
                    stack.push(str[j]);
                    break;
                    
                    case '}':
                        if (!stack.isEmpty() && stack.peek='{')
                        {
                            stack.pop();
                        }else
                        {
                            result="NO_ELEMENT";
                        }
                        break;
                    
                        case ']':
                        if (!stack.isEmpty() && stack.peek='[')
                        {
                            stack.pop();
                        }else
                        {
                            result="NO_ELEMENT";
                        }
                        break;
                        case ')':
                        if (!stack.isEmpty() && stack.peek=')')
                        {
                            stack.pop();
                        }else
                        {
                            result="NO_ELEMENT";
                        }
                        break;
                        
                }
                if(result=="NO_ELEMENT")
                {
                oResult="NO";
                break;}}
                if(stack.size()>0)
                oResult="NO";
                
                System.out.println(oResult);
                oResult="YES";
    }
    sc.close();
}
