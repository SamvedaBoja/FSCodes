
/*
Neeraj wants to create a coding system which converts a word(all uppercase) into a number as follows.
A means 1,
B means 2,
...
Z means 26,
AA means 27,
AB means 28,
...
AAA means 703
...

You are given a word W,
Your task is to help Neeraj to convert W into a number using
the given coding system.

Input Format:
-------------
A string W,a word.


Output Format:
--------------
Print an integer result.

Constraints:
---------
	- 1 <= word.length <= 7
	- W is in the range ["A", "FXSHRXW"].


Sample Input-1:
---------------
D

Sample Output-1:
----------------
4

Sample Input-2:
---------------
RRR

Sample Output-2:
----------------
12654


 */
import java.util.*;
class Array2D
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int val = c-'A'+1;
            res=res*26+val;
        }
        System.out.println(res);
    }

}