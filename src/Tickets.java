
/*
In a theatre, there are N people stand in a line for tickets,
male represented with 1 and female represented with 0.

Theater management decides to issue the tickets in such a way that
if one ticket issued to a male, next ticket should be issued to a female only,
and vice versa.

In order to follow it, they planned to make few alterations in the line itself,
so that no two adjacent persons have same gender.

You are given a binary string S, represents intial order of the people in the line.
In one alteration, you can replace one female '0' with a  male '1' or vice versa.

Your task to find and print the minimum number of alterations needed
to make the line to follow alternate gender sequence.

Input Format:
-------------
A binary String, S.

Output Format:
--------------
Print an integer, minimum number of alterations.


Sample Input-1:
---------------
1001

Sample Output-1:
----------------
2


Sample Input-2:
---------------
101101

Sample Output-2:
----------------
3
*/


/*
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        int count=0;
        if(s.charAt(0)=='1'){
            for(int i=2;i<s.length()-1;i=i+2){
                if(s.charAt(i)!='1'){
                    count++;
                }
            }
            for(int i=1;i<s.length()-1;i=i+2){
                if(s.charAt(i)!='0'){
                    count++;
                }
            }
        }
        else if(s.charAt(0)=='0'){
            for(int i=2;i<s.length()-1;i=i+2){
                if(s.charAt(i)!='0'){
                    count++;
                }
            }
            for(int i=1;i<s.length();i=i+2){
                if(s.charAt(i)!='1'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
*/
import java.util.*;
public class Tickets{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            char c1=(i%2==0)?'0':'1';
            char c2=(i%2==0)?'1':'0';
            if(s.charAt(i)!= c1)
                count1++;
            if(s.charAt(i)!= c2)
                count2++;
        }
        System.out.println(Math.min(count1,count2));
    }
}