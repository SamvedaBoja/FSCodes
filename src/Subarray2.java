/*
You are given an integer array nums and two integers k and p.

A subarray is a contiguous non-empty sequence of elements in nums.

A subarray is valid if it contains at most k elements divisible by p.

Find the number of distinct valid subarrays.

Input Format:
----------------
Line-1 array elements
Line-2 k value
Line-3 p-value

Sample Testcase:1
-------------------------
input=2 3 3 2 4
2
2
output=11

Explanation:
----------------------
Possible distinct subarrays satisfying the condition: [2], [3], [3], [2], [4], [2,3], [3,3], [3,2], [2,4], [3,3,2], [3,2,4]
*/
import java.util.*;
class Subarray2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int p=sc.nextInt();
        HashSet<String> sub = new HashSet<>();
        for(int i=0;i<a.length;i++){
            int count=0;
            StringBuilder str = new StringBuilder();
            for(int j=i;j<a.length;j++){
                if(a[j]%p == 0)
                    count++;
                if(count>k)
                    break;
                str.append(a[j]);
                str.append(",");
                sub.add(str.toString());
            }
        }
        System.out.println(sub.size());
    }
}







