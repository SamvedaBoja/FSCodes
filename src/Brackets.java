/*

In a collaborative code editor platform like Google Docs for Code, developers
 often write and review code together in real-time. To assist users and prevent
 syntax errors, the platform wants to implement an automatic validation feature
 that checks whether a given snippet of code has balanced parentheses, brackets,
 and braces.

As part of this feature, your task is to determine whether an expression
(consisting of different types of brackets – (), {}, and []) is balanced or not.
 An expression is considered balanced if:

Every opening symbol has a corresponding closing symbol.
Brackets are closed in the correct order.

Sample Testcase:1
-------------------------
input=({([])})
output=true


 */

import java.util.*;
class Brackets{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='('||s.charAt(i)=='['||st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}' && st.peek()=='{'){
                st.pop();
            }
            else if(s.charAt(i)==')' && st.peek()=='('){
                st.pop();
            }
            else if(s.charAt(i)==']' && st.peek()=='['){
                st.pop();
            }
        }
        if(st.isEmpty()){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}