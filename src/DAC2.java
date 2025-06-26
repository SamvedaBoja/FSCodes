/*
Find Maximum element in the array using divide and conquer

Sample Testcase:1
------------------------
input=3 8 2 5 9 1
output=9
 */

import java.util.*;
class DAC2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int l=0,r=a.length-1;
        int res=DAC(a,l,r);
        System.out.println(res);
    }
    public static int DAC(int a[],int l,int r){
        if(l==r){
            return a[l];
        }
        int mid=l+(r-l)/2;
        int max1 = DAC(a,l,mid);
        int max2 = DAC(a,mid+1,r);
        int ans = Math.max(max1,max2);
        return ans;
    }
}