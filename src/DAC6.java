/*
Given an integer array nums, find the subarray with the largest sum, and
return its sum.

Sample Testcase:1
----------------------------------------
input=9
-2 1 -3 4 -1 2 1 -5 4
output=6
Explanation:
-----------------------
The subarray [4,-1,2,1] has the largest sum 6.
 */

import java.util.*;
public class DAC6{
    public static int maxCrossingSum(int[] a, int low, int mid, int high){
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = mid; i >= low; i--){
            sum += a[i];
            if (sum > leftSum)
                leftSum = sum;
        }
        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= high; i++){
            sum += a[i];
            if (sum > rightSum)
                rightSum = sum;
        }
        return leftSum + rightSum;
    }
    public static int maxSubArraySum(int[] a, int low, int high){
        if (low == high)
            return a[low];
        int mid = (low + high) / 2;
        int left = maxSubArraySum(a, low, mid);
        int right = maxSubArraySum(a, mid + 1, high);
        int cross = maxCrossingSum(a, low, mid, high);
        return Math.max(Math.max(left, right), cross);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int ans = maxSubArraySum(a, 0, n - 1);
        System.out.println(ans);
    }
}
