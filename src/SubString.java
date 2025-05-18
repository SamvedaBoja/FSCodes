/*

A password security system needs to check if a password contains at least one
substring with all unique characters.

If such a substring exists, return its length.

If all characters are the same, return -1.

Your task is to write a program that takes a string s and finds the length of
the longest substring that has no duplicate characters.
If no unique substring exists, return -1.


Sample Testcase:1
---------------------------------
input=abcabcbb
output=3
Explanation:
-------------------
The answer is "abc", with the length of 3.


 */

import java.util.*;
class SubString{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0;
        int r=0;
        int res=0;
        HashSet<Character> hs = new HashSet<>();
        /*
        while(r<s.length()){
            if(!hs.contains(s.charAt(r))){
                hs.add(s.charAt(r));
                res=Math.max(res,r-l+1);
                r++;
            }
            else{
                hs.remove(s.charAt(l));
                l++;
            }
        }
        */

        for(int i=0;i<s.length();){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                res=Math.max(res,i-l+1);
                i++;
            }
            else{
                hs.remove(s.charAt(l));
                l++;
            }
        }
        System.out.println(res);
    }
}


/*
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int res=0;
        List<Character> l = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!l.contains(s.charAt(i))){
                l.add(s.charAt(i));
                res=Math.max(l.size(),res);
            }
            else{
                l.clear();
                l.add(s.charAt(i));
            }
        }
        System.out.println(res);
    }
}
*/
