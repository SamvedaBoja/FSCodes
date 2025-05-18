
/*
You are given an array prices where prices[i] represents the price of a stock on the i-th day.

You are allowed to buy the stock on one day and sell it on a later day (not the same day). Your goal is to maximize your profit from this single transaction.

Constraints:
-------------------------------
You must buy before you sell.
If no profit can be made, return 0.


Sample Testcase:1
-------------------------------------
input=6
7 1 5 3 6 4
output=5
Explanation:
---------------------------
Buy on day 2 (price = 1) and sell on day 5 (price = 6),
profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you
must buy before you sell.

 */

import java.util.*;
class Profit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min= a[0];
        int max=0;
        for(int i=1;i<n;i++){
            if(a[i] < min){
                min = a[i];
            }
            else{
                int profit = a[i]-min;
                max = Math.max(max,profit);
            }
        }
        System.out.println(max);
    }
}