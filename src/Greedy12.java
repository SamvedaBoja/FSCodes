/*
You are given an integer array prices where prices[i] is the price
of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock.
You can only hold at most one share of the stock at any time.
However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

Sample Testcase:1
----------------------------------
input=7 1 5 3 6 4
output=7

Explanation:
-----------------------------
Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6),
profit = 6-3 = 3.
Total profit is 4 + 3 = 7.

 */

import java.util.*;
class  Greedy12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int sum=0;
        int temp=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1]){
                sum=arr[i]-arr[i-1];
                temp=temp+sum;
            }
        }
        System.out.print(temp);
    }
}