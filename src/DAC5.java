/*
Given an array of integers nums, sort the array(Quick Sort Algorithm)
in ascending order.

        Note: Don't use built in functions

Sample Testcase:1
        ------------------------------
input=4
        5 2 3 1
output=[1, 2, 3, 5]
 */
import java.util.*;
class DAC5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quickSort(a,0,a.length-1);
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            l.add(a[i]);
        }
        System.out.println(l);
    }
    public static void quickSort(int a[],int l,int r){
        if(l<r){
            int pivot=partition(a,l,r);
            quickSort(a,l,pivot-1);
            quickSort(a,pivot+1,r);
        }
    }
    public static int partition(int a[],int s,int e){
        int pivot = a[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(a[j]<pivot){
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