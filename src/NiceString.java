/*
A string s is nice if, for every letter of the alphabet that s contains, it appears
 both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a'
appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple,
return the substring of the earliest occurrence. If there are none, return an empty string.

Input: s = YazaAay
Output: aAa
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.


 */

import java.util.*;
class SubStringRepeat{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res=checkNice(s);
        System.out.println(res);
    }
    public static String checkNice(String s){
        Set<Character> hs = new HashSet<>();
        for(char c: s.toCharArray()){
            hs.add(c);
        }
        for(int i=0;i<s.length();i++){
            if(hs.contains(Character.toUpperCase(s.charAt(i))) && hs.contains(Character.toLowerCase(s.charAt(i)))){
                continue;
            }
            String s1=checkNice(s.substring(0,i));
            String s2=checkNice(s.substring(i+1));
            return s1.length()>=s2.length()?s1:s2;
        }
        return s;
    }
}