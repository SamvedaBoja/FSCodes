/*
Write a Java program that sorts an array using Selection Sort.
The program should take an array of integers as input and return
the sorted array in ascending order.

Sample Testcase:1
-----------------------------
input=5 3 8 1 2
output=1 2 3 5 8
*/
import java.util.*;
class SelectionSort {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        for(int i=0;i<a.length;i++){
            int min=a[i];
            int index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    index=j;
                }
            }
            int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

