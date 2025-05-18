/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum
average value and return this value.

Sample Testcase:1
------------------------------------
input=1 12 -5 -6 50 3
4
output: 12.75000

Explanation:
----------------
 Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/
/*
import java.util.*;
public class SubarrayAvg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int n = sc.nextInt();
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++)
            a[i]=Integer.parseInt(s[i]);
        double max = 0;
        double sum=0;
        int start = 1,end = n;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        max = sum/n;
        sum= sum-a[0];
        while(end<a.length){
            sum=sum+a[end];
            double avg = sum/n;
            max = Math.max(avg,max);
            sum = sum-a[start];
            start++;
            end++;
        }
        System.out.println(max);
    }
}
*/
import java.util.*;
class SubarrayAvg{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int k=sc.nextInt();
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        double maxSum=sum;
        for(int i=k;i<a.length;i++){
            sum=sum-a[i-k]+a[i];
            if(sum>maxSum)
              maxSum=sum;
        }
        System.out.println(maxSum/k);
}
}


 