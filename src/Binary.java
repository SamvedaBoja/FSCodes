/*
Given a binary string s, return the number of non-empty substrings that have
the same number of 0's and 1's, and all the 0's and all the 1's in these
substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

Input Format:
-----------------------
Binary Number

Output Format:
------------------------
An Integer count

Sample TestCase:1
-------------------------
input=00110011
output=6

Explanation:
-------------------------
There are 6 substrings that have equal number of consecutive 1's
and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times
they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not
grouped together.
 */
import java.util.*;
class Binary{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=0;
        int c=1;
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                count += Math.max(len,c);
                len=c;
                c=1;
            }
        }
        System.out.print(count);
    }
}