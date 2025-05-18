
/*
Given an integer n, return the number of trailing zeroes in n!.
Use recursion
Input Format:
-----------------------
Integer Number

Output Format:
------------------------
An Integer count

Sample Testcase:1
------------------------
input=5
output=1

Explanation:
-------------------------
 5! = 120, one trailing zero.

 */
/*
import java.util.*;
class Factorial{
    public static int fact(int n){
        if(n==0)
            return 0;
        else
            return n/5+fact(n/5);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
*/
import java.util.*;
class Factorial{
    public static int fact(int n){
        int count=0;
        while(n>0){
            n=n/5;
            count=count+n;
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
