
/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character
 while preserving the order of characters. No two characters may map to
 the same character, but a character may map to itself.

Sample Testcase:1
-----------------------------
input=add egg
output=true

 */
import java.util.*;
class Isomorphic{
    public static boolean iso(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        else{
            HashMap<Character,Character> hm=new HashMap<>();
            for(int i=0;i<s.length();i++){
                char a=s.charAt(i);
                char b=t.charAt(i);
                if(hm.containsKey(a)){
                    if(hm.get(a)!=b){
                        return false;
                    }
                }
                else{
                    if(hm.containsValue(b)){
                        return false;
                    }
                    hm.put(a,b);
                }
            }
            return true;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(iso(s,t));
    }
}


