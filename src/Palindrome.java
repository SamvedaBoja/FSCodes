
/*
A palindrome is a word, phrase, or sentence that reads the same backwards and
        forwards. For example, the word ``radar'' is a palindrome. For this problem,
you must write a program  that reads a string of characters and prints
whether or not the entire string  is a palindrome.
Your program should ignore all blanks, numbers,  punctuation and special c
        haracters, and
should be case insensitive (i.e., it should not care if characters are capital
        letters or small letters).
For example "5R3a dAr!" should be considered to be a palindrome.

Input Format:
        ---------------------
Input consists of a string which is no greater than 100 characters long.

Output Format:
        ---------------------v
The program should print  yes (if the input was a palindrome) or no (otherwise).

Sample Testcase:1
        --------------------
input=Radar
        output=yes

Sample Testcase:2
        --------------------
input=rAd . Ar
        output=yes
*/
import java.util.*;
class Palindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                str += s.charAt(i);
            }
            else{
                continue;
            }
        }
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(rev)){
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}
