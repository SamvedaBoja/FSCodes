/*
Given a container with N+1 balls with a number print on them.
Numbers are between 0 to N, there is no repetition of numbers.

A ball is missed from the container.
Your task is to findout the ball, and return the number printed on it.

Input Format:
-------------
Line-1: An integer N.
Line-2: N space separated integers, numbers[].

Output Format:
--------------
An integer, print the number on the missing ball.


Sample Input-1:
----------------
4
3 0 1 4

Sample Output-1:
------------------
2


Sample Input-2:
----------------
6
3 0 1 4 5 2

Sample Output-2:
------------------
6

 */
import java.util.*;
class Number{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            freq[a[i]]=1;
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(freq[i]==0)
                index=i;
        }
        System.out.println(index);
    }
}