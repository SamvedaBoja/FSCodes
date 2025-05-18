/*
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

Sample Testcase:1
----------------------------------------------
input=1 4 2 5 3
output=58

Explanation:
-----------------------
The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 */


import java.util.*;
class AddSubarray{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int[] arr = new int[s.length];
    for(int i=0;i<s.length;i++){
        arr[i] = Integer.parseInt(s[i]);
    }
    int res = 0;
    for(int len=1; len<=arr.length;len += 2){
        int sum = 0;
        for(int i=0;i<len;i++){
            sum += arr[i];
        }
        res += sum;
        for(int i=len;i<arr.length;i++){
            sum +=  arr[i] - arr[i-len];
            res += sum;
        }
    }
    System.out.println(res);
    }
}

