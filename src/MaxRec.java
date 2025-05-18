/*
Write a recursive function to find the maximum element in an array.

Sample Testcase:1
        --------------------------------
Input=3 1 8 5 2
Output=8
*/
import java.util.*;
class MaxRec{
    public static int findMax(int[] a,int n){
        if(n==1){
            return a[0];
        }
        return Math.max(a[n-1],findMax(a,n-1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String[] in=line.split(" ");
        int size=in.length;
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=Integer.parseInt(in[i]);
        }
        int max=findMax(a,size);
        System.out.println(max);
    }
}

