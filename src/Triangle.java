/*
Given an integer array nums, return the number of triplets chosen
 from the array that can make triangles if we take them as side
 lengths of a triangle. If no triangles are formed from the array
print 0.


Sample Testcase:1
----------------------------
input=4
2 2 3 4
output=3
Explanation:
-------------------------
Valid combinations are:
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3

Sample Testcase:2
----------------------------
input=4
4 2 3 4
output=4

 */
/*
import java.util.*;
public class Triangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int  i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int count=0;
        for(int k=n-1;k>=2 ;k--){
            int i=0,j=k-1;
                 while(i<j) {
                     if(a[i]+a[j]>a[k]){
                         count = count + (j-i);
                         j--;
                     }
                     else{
                         i++;
                     }
                 }
        }
        System.out.println(count);
    }
}

 */


import java.util.*;
public class Triangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int  i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int count=0;
        /*
        for(int k=n-1;k>=2 ;k--){
            int i=0,j=k-1;
                 while(i<j) {
                     if(a[i]+a[j]>a[k]){
                         count = count + (j-i);
                         j--;
                     }
                     else{
                         i++;
                     }
                 }
        }
        System.out.println(count);

         */
        
    }
}

