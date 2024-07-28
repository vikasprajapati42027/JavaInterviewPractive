package org.example.collections.practice.Date20240126;

import java.util.Stack;

public class parenthesic {
    public  static void isParenthasic(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(s.empty())
            {
                s.push(ch);
            }
            else if(ch=='(' || ch=='{' || ch=='[')
            {
                s.push(ch);
            }
            else if(ch=='{' && s.peek()=='}') {
               s.pop();
            }
            else if(ch=='(' && s.peek()==')') {
                s.pop();
            }
            else if(ch=='[' && s.peek()==']') {
                s.pop();
            }

        }
        if(s.empty())
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
    public static void main(String[] args) {
        String str="()";
        isParenthasic(str);
    }
}
