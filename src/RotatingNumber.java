/*
When a number is turned upside down, if the new number is same as original.
It is called Rotating-Number.

You are given a number as string,
Your task is to findout, whether the given number is Rotating-Number or Not.
If yes, print 'true'.
otherwise 'false'.

Input Format:
-------------
A numeric string, num

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
69

Sample Output-1:
----------------
true


Sample Input-2:
---------------
962

Sample Output-2:
----------------
false


==== HINT ====
	- Create a map<char,char> with digits which can be rotated 180degrees can form another digit.
		example: 0->0, 1->1, 6->9, 8->8, 9->6.
	- initialize two variables l with 0 and r with string.length-1.
	- read each digit from the number and
			- check, whether it belongs to above map, if it is not return false.
			- check value at 'l' position in the map and digit at 'r' poistion in number,
			  if both are not equal, return false.
			- decrement r value by 1, and increment l value by 1.
	- if you read, all the digits in the string, return true.

 */

import java.util.*;
class RotatingNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Character> hm=new HashMap<>();
        hm.put('0','0');
        hm.put('1','1');
        hm.put('6','9');
        hm.put('9','6');
        hm.put('8','8');
        int l=0,r=s.length()-1;
        boolean flag=true;
        while(l<=r){
            if(!hm.containsKey(s.charAt(l)) || hm.get(s.charAt(l)) != s.charAt(r)){
                flag=false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(flag);
    }
}