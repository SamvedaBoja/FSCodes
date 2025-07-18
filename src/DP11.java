
/*
There are n children standing in a line. Each child is assigned a rating value
given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:
Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.

Return the minimum number of candies you need to have to distribute the candies
to the children.

case=1
input=3
1 0 2
output=5
Explanation: You can allocate to the first, second and third child with 2, 1, 2
candies respectively.
 */

import java.util.*;
class  DP11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                dp[i]=dp[i-1]+1;
            }
        }
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>a[i+1]){
                dp[i]=Math.max(dp[i],dp[i+1]+1);
            }
        }
        int mincandy=0;
        for(int i=0;i<n;i++){
            mincandy += dp[i];
        }
        System.out.println(mincandy);
    }
}