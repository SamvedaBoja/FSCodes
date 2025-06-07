/*
Given an integer array nums and an integer k, return the kth largest element
in the array.
Note that it is the kth largest element in the sorted order,
not the kth distinct element.

Use divide and conquer approach

Sample Testcase:1
---------------------------------
input=6
3 2 1 5 6 4
2
output=5
*/

import java.util.*;
class DAC1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        quickSort(a,0,a.length-1);
        System.out.println(a[t-1]);
    }
    public static void quickSort(int a[],int s,int e){
        if(s<e){
            int pivot = partition(a,s,e);
            quickSort(a,s,pivot-1);
            quickSort(a,pivot+1,e);
        }
    }
    public static int partition(int a[],int s,int e){
        int pivot=a[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(a[j]>pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[e];
        a[e]=temp;
        return i+1;
    }
}