/*

A wireless network provider is analyzing signal strengths represented as binary
values in an area.

1 represents a strong signal
0 represents a weak signal

The provider has the option to boost the signal in at most k locations (flip 0 to 1).
Your task is to write a program that finds the maximum consecutive strong signals (1s)
after boosting at most k weak signals (0s).


Sample Testcase:1
---------------------------------
input=1 1 1 0 0 0 1 1 1 1 0
2
output=6
Explanation:
----------------------------
[1,1,1,0,0,1,1,1,1,1,1]
numbers were flipped from 0 to 1.


 */

import java.util.*;
class Flip{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int k=sc.nextInt();
        int l=0,r=0,maxOnes=0,zerosCount=0;
        while(r<a.length){
            if(a[r]==0)
                zerosCount++;
            while(zerosCount>k){
                if(a[l]==0){
                    zerosCount--;
                }
                l++;
            }
            maxOnes=Math.max(maxOnes,r-l+1);
            r++;
        }
        System.out.println(maxOnes);
    }
}