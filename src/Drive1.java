/*
LCS With Palindrome
----------------------------
Sam loves palindromes. One day, his father comes and gives him two strings.
Sam is interested in finding the length of the longest common palindrome subsequence and wants your help with it.
Input Specification:
-----------------------
input1: First string which is given by his father. input2: Second string which is given by his father.

Output Specification:
Return the length of longest common palindrame subsequence.
Example 1: input1: adfa input2: aagh
Output: 2
Explanation:
Only common palindrome subsequence is aa so length is 2.

 */
import java.util.*;
public class Drive1 {
    static int len=0;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();

        genSub("",s1,s2);
        System.out.println(len);

    }
    static void genSub(String current,String rem,String s2){
        if(!current.isEmpty() && isPalindrome(current) && isSubsequence(current,s2)){
            len=Math.max(len,current.length());
        }
        if(rem.isEmpty())
            return;
        genSub(current + rem.charAt(0),rem.substring(1),s2);
        genSub(current,rem.substring(1),s2);
    }
    static boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l++) != s.charAt(r--))
                return false;
        }
        return true;
    }
    static boolean isSubsequence(String sub,String s){
        int i=0,j=0;
        while(i<sub.length() && j<s.length()){
            if(sub.charAt(i) == s.charAt(j))
                i++;
            j++;
        }
        return i==sub.length();
    }
}
