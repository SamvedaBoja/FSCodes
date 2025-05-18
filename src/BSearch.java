
/*
Given an array nums of integers and an integer k, return the maximum sum of
 two numbers such that their sum is strictly less than k. If no such pair exists, return -1.


Input: nums = [10, 20, 30], k = 50
Output: 40
Explanation: The pair (10, 30) has the maximum sum less than 50, which is 40.

 */
import java.util.*;
class BSearch{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int k=sc.nextInt();
        int sum=0,max=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=a[i]+a[j];
                if(sum<k){
                    max=Math.max(max,sum);
                }
            }
        }
        System.out.println(max);
    }
}