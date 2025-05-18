/*
Write a Java program that sorts an array using Merge Sort (Recursive).
The program should take an array of integers and return the sorted array
in ascending order.

Sample Testcases:1
--------------------------------
input=12 4 7 9 3
output=3 4 7 9 12
*/
import java.util.*;
public class MergeSort{
    public static void merging(int arr[],int l,int mid,int r){
        int n = mid-l+1;
        int m = r-mid;
        int a1[]= new int[n];
        int a2[]= new int[m];
        for(int i=0;i<n;i++){
            a1[i]=arr[l+i];
        }
        for(int i=0;i<m;i++){
            a2[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n && j<m){
            if(a1[i]<=a2[j]){
                arr[k]=a1[i];
                i++;
            }
            else{
                arr[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=a2[j];
            j++;
            k++;
        }
    }
    public static void divide(int arr[],int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            divide(arr,l,mid);
            divide(arr,mid+1,r);
            merging(arr,l,mid,r);
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s[]= sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        divide(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
 