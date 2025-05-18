
/*
Given a string S in encoded form, and  an integer array indices[] of string length.

You need to find the decoded form of String S,
by moving each character at ith position in S, to indices[i] position in decoded string.
and then print the decoded string.

Input Format:
-------------
Line-1 -> A String S, enocded string of length L
Line-2 -> L space separated integers indices[], where 0 <=indices[i] < L

Output Format:
--------------
Print a String, decoded string.


Sample Input-1:
---------------
aeilmmor
6 1 5 7 2 0 3 4

Sample Output-1:
----------------
memorial

Explanation:
---------------
Given String, aeilmmor
6 1 5 7 2 0 3 4
after shifting,	memorial


Sample Input-2:
---------------
aidin
4 3 2 0 1

Sample Output-2:
----------------
india

Explanation-2:
---------------
Given String, aidin
4 3 2 0 1
after shifting,	india



 */
import java.util.*;
class Encode{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a[]=new int[s.length()];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        TreeMap<Integer,Character>tm=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            tm.put(a[i],s.charAt(i));
        }
        for(int i:tm.keySet()){
            System.out.print(tm.get(i));
        }
    }
}