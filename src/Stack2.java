/*
You are given a string s that contains:
Lowercase English letters (a–z)
Parentheses: '(' and ')'
Your task is to remove the minimum number of parentheses such that the resulting
string is valid.

A valid parentheses string is defined as:
An empty string ""
A string containing only lowercase letters (no parentheses)
A string that can be formed by concatenating two valid strings: "AB"
A string enclosed in matching parentheses: "(A)", where A is valid

Sample test case:1
----------------------------
input=a((b)c)
output=a((b)c)
Explanation:
--------------------------------
determine if the parentheses are balanced and valid it is valid nothing to be removed
 */

import java.util.*;
class Stack2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<Integer> a = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c == '('){
                st.push(i);
            }
            else if(c==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    a.add(i);
                }
            }
        }
        while(!st.isEmpty()){
            a.add(st.pop());
        }
        for(int i=0;i<s.length();i++){
            if(!a.contains(i)){
                str.append(s.charAt(i));
            }
        }
        System.out.println(str.toString());
    }
}