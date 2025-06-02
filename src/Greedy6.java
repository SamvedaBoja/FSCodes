/*
You are given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit
(6 becomes 9, and 9 becomes 6).

Sample TestCase:1
------------------------
input=9669
output=9969

Explanation:
-----------------------------
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
 */

import java.util.*;
class Greedy6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        int temp=Integer.parseInt(s);
        for(int i=0;i<s.length();i++)
        {
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i,'9');
                int num=Integer.parseInt(sb.toString());
                if (num>temp)
                    temp=num;
                break;
            }
        }
        System.out.print(temp);
    }
}