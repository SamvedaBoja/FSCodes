
/*
You are given a string S. Replace all characters in the string with the
character that appears the most frequently in the string. If there are
multiple characters with the highest frequency, replace all with the first
one alphabetically.

Input Format:
        ------------------
Line-1 -> A string S.

Output Format:
        -------------------
Print the modified string after replacing each character with the most frequent character.

Sample Input:
        ------------------
input=hello
        output=lllll

Explanation:
        --------------------
The character 'l' appears 2 times, which is more than any other character
in the string. So, all characters are replaced by 'l'.
*/

import java.util.*;
class Replace{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int max=0;
        char r=' ';
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                r=entry.getKey();
            }
        }
        for(int i=0;i<s.length();i++){
            System.out.print(r);
        }
    }
}