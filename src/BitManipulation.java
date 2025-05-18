
/*
 Bablu is playing a word puzzle game.
 Initially, puzzle conatins a word S, you need to form another word 'T' using 'S'.

The game rules are as follows:
	1. You can jumble the letters in the given word as your need.
	2. You can add only one letter to the jumbled word at any position
           to form the word T.
You are given two words, S and T.
 Your  task is to find and print the newly added character to S to form T.

Input Format:
-------------
Two space separated Strings S and T.

 Output Format:
--------------
 Print a character, added to S.

 Sample Input-1:
 ---------------
ram marg

Sample Output-1:
----------------
g

Sample Input-2:
---------------
av ava

Sample Output-2:
----------------
a
 */
import java.util.*;
class BitManipulation{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int index=0;
        for(int i=0;i<s.length();i++){
            index= index ^ s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            index= index ^ t.charAt(i);
        }
        System.out.println((char) index);
    }
}