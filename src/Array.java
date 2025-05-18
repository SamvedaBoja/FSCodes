/*
Ramesh is given an array of N numbers L[] and another number K,
Your task is to delete all the occurences of K in the L[],
and return the length of L[] after deleting.

You should use only array L[] and Do not allocate extra space for another array.

Sample Testcase:1
-----------------------------
Input:5 3			// N=5 and K=3
1 3 2 2 3		//L[]
output=3

Input:10 2					// N=10 and K=3
1 4 4 6 2 3 2 2 3 5		//L[]
output=7

 */
import java.util.*;
class Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=n;
        for(int i=0;i<a.length;i++){
            if(a[i]==k)
                count--;
        }
        System.out.println(count);
    }
}