
/*
Java program to print all possible subarrays of a given array.

Sample TestCase:1
        ---------------------------
input=1 2 3
output=1
        1 2
        1 2 3
        2
        2 3
        3
*/
/*
//Time complexity O(n^3)
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
*/
import java.util.*;
class Subarray1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);          //Time complexity = O(n^2)
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            StringBuilder str = new StringBuilder();
            for(int j=i;j<a.length;j++){
                str.append(a[j]);
                str.append(" ");
                System.out.println(str.toString());
            }
        }
    }
}
