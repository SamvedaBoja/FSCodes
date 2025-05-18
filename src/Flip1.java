/*
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing
only 1's in the resulting array. Return 0 if there is no such subarray.

 maintaining the longest operational sequence.

Sample Testcase:1
---------------------------
input=1 1 0 1 1 1 0 1 1
output=5


 */

import java.util.*;
class Flip1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int l=0,r=0,zcount=0,maxOnes=0;
        while(r<a.length){
            if(a[r]==0){
                zcount++;
            }
            while(zcount>1){
                if(a[l]==0){
                    zcount--;
                }
                l++;
            }
            maxOnes = Math.max(maxOnes,r-l);
            r++;
        }
        System.out.println(maxOnes);
    }
}