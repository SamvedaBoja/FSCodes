/*
You're given an array of strings (strs). Each string is either:
Only digits → Its value is the number it represents (e.g., "0042" → 42)
Contains any letters → Its value is its length (e.g., "abc123" → 6)
Goal: Find the maximum value among all strings based on this rule.

Sample Testcase:1
---------------------------------
input=alic3,bob,3,4,00000
output=5
Explanation:
-----------------------------------
- "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
- "bob" consists only of letters, so its value is also its length, i.e. 3.
- "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
- "4" also consists only of digits, so its value is 4.
- "00000" consists only of digits, so its value is 0.
Hence, the maximum value is 5, of "alic3".
 */

import java.util.*;
class StringLength{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str[]=sc.next().split(",");
        int max=0;
        for(String s:str){
            boolean flag = true;
            for(int i=0;i<s.length();i++){
                if(!Character.isDigit(s.charAt(i))){
                    flag=false;
                    break;
                }
            }
            int res=0;
            if(flag == false){
                res = s.length();
            }
            else{
                res = Integer.parseInt(s);
            }
            max=Math.max(max,res);
        }
        System.out.println(max);
    }
}

