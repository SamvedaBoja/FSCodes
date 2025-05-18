/*
You are given a 0-indexed integer array nums of size n.
Define two arrays leftSum and rightSum where:
leftSum[i] is the sum of elements to the left of the index i in the array nums.
If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums.
If there is no such element, rightSum[i] = 0.
Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.
Testcase:1
input=10 4 8 3
output=15 1 11 22
case=1
input=10 4 8 3
output=15 1 11 22
case=2
input=42 13
output=6 037
 */
import java.util.*;
public class SumArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]= sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int lsum[]=new int[a.length];
        int rsum[]=new int[a.length];
        int sum[]=new int[a.length];
        for(int i=1;i<a.length;i++){
                lsum[i]=lsum[i-1]+a[i-1];
        }
        for(int i=a.length-2;i>=0;i--){
            rsum[i]=rsum[i+1]+a[i+1];
        }
        for(int i=0;i<sum.length;i++){
            sum[i]=Math.abs(lsum[i]-rsum[i]);
        }
        for(int i=0;i<sum.length;i++){
            System.out.print(sum[i]+" ");
        }

    }
}
