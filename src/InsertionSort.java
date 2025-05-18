/*
Write a Java program that sorts an array using Insertion Sort.
The program should take an array of integers and sort it in ascending order.

Sample Testcase:1
-----------------------------
input=9 5 1 4 3
output=1 3 4 5 9
 */

import java.util.*;
class InsertionSort{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}