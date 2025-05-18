
/*
AlphaCipher is a string formed from another string by rearranging its letters

You are given a string S.
Your task is to check, can any one of the AlphaCipher is a palindrome or not.

Input Format:
-------------
A string S

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
carrace

Sample Output-1:
----------------
true


Sample Input-2:
---------------
code

Sample Output-2:
----------------
false


==== HINT ====
1. Create a character set.
2. Traverse the given string.
	3. For every character in the string, remove the character if the set already contains else add to the set.
	4. If the string length is even the set is expected to be empty.
	5. Or if the string length is odd the set size is expected to be 1
6. On the above two conditions (4) or (5) return true else return false.
*/

 import java.util.*;
class Palindrome1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
            }
            else{
                st.remove(s.charAt(i));
            }
        }
        if(s.length()%2 == st.size()){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}