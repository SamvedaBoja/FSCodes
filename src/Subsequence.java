
/*
Given two strings s and t, return true if s is a subsequence of t,
or false otherwise. A subsequence of a string is a new string generated
 from the original string with some characters (can be none) deleted
 without changing the relative order of the remaining characters.

Sample Testcase:1
-----------------------------------
input=abc ahbgdc
output=true

input=axc ahbgdc
output=false
*/
import java.util.*;
class Subsequence{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String sub=sc.next();
        String str=sc.next();
        int i=0;
        int j=0;
        while(j<str.length()){
            if(sub.charAt(i)==str.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==sub.length()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

