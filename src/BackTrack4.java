/*
The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
Given an array nums, return the sum of all XOR totals for every subset of nums.

Note: Subsets with the same elements should be counted multiple times.

An array a is a subset of an array b if a can be obtained from b by deleting
some (possibly zero) elements of b.

Sample Testcase:1
-----------------------------------
input=2
1 3
Output=6
Explanation:
-----------------------------

 The 4 subsets of [1,3] are:
- The empty subset has an XOR total of 0.
- [1] has an XOR total of 1.
- [3] has an XOR total of 3.
- [1,3] has an XOR total of 1 XOR 3 = 2.
0 + 1 + 3 + 2 = 6
 */
import java.util.*;
public class BackTrack4 {
    static int sum=0;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        List<Integer> l =new ArrayList<>();
        backtrack(a,l,0);
        System.out.println(sum);
    }
    public static void backtrack(int a[],List<Integer> l,int index){
        if(index == a.length){
            int xor=0;
            for(int i:l){
                xor = xor^i;
            }
            sum += xor;
            return;
        }
        l.add(a[index]);
        backtrack(a,l,index+1);

        l.remove(l.size()-1);
        backtrack(a,l,index+1);
    }
}
