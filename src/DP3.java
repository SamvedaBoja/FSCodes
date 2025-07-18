/*
The Tribonacci sequence is defined as:
T0 = 0
T1 = 1
T2 = 1
For n >= 3: Tn = Tn-1 + Tn-2 + Tn-3
Return Tn.

Sample Testcase:1
------------------------------
input=
output=
 */

import java.util.*;
class DP3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        if(n==1){
            System.out.println(1);
        }
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }
        System.out.print(dp[n]);
    }
}