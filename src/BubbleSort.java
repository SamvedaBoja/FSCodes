/*
Write a Java program that sorts an array using Bubble Sort.
The program should take an array of integers as input and return the sorted array.

Sample Testcase:1
-----------------------------
input=7 4 10 3 1
output=1 3 4 7 10
 */
import java.util.*;
public class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}