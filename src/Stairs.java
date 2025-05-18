/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you reach the top?

Sample Testcase:1
---------------------------
input=2
output=2

Explanation:
-----------------------
Climb 1 step + 1 step
Climb 2 steps
 */

import java.util.*;
class Stairs{
    public static int fib(int n){
        if(n==0 || n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fib(n));
    }
}
