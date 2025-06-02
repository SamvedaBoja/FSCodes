/*
Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not, return the index
 where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Sample Testcase:1
----------------------------
input=1 3 5 6
5
output=2



 */
import java.util.*;
class BinarySearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int k=sc.nextInt();
        int l=0,r=a.length-1;
        while(l<=r){
            int  mid=l+(r-l)/2;
            if(a[mid]==k)
                break;
            else if(a[mid]>k)
                r=mid-1;
            else
                l=mid+1;
        }
        System.out.println(l);
    }

}
