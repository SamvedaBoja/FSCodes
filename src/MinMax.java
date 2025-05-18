import java.util.*;
class MinMaxRecursion{
    public static int findMin(int a[],int n){
        if(n==1){
            return a[0];
        }
        return Math.min(a[n-1],findMin(a,n-1));
    }
    public static int findMax(int a[],int n){
        if(n==1){
            return a[0];
        }
        return Math.max(a[n-1],findMax(a,n-1));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=findMin(a,n);
        int max=findMax(a,n);
        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);
    }
}