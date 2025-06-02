/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has
piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she
chooses some pile of bananas and eats k bananas from that pile. If the pile
has less than k bananas, she eats all of them instead and will not eat any
more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas
before the guards return.

Return the minimum integer k such that she can eat all the bananas within
h hours.

Sample Testcase:1
------------------------
input=4
3 6 7 11
8
output=4
 */
/*
public class BinSearch3 {
}
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int h=sc.nextInt();

        int l=1;
        int r=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>r)
                r=a[i];
        }
        int res=r;
        while(l<=r){
            int mid=(l+(r-l))/2;
            int k=0;
            for(int i=0;i<n;i++){
                k += (a[i] + mid -1 /mid);
            }
            if(k<=h){
                res = mid;
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(res);
    }
}

 */

import java.util.*;
class BinSearch3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++){
            piles[i] = sc.nextInt();
        }
        int h = sc.nextInt();

        int low = 1;
        //int high = Arrays.stream(piles).max().getAsInt();
        int high=piles[0];
        for(int i=1;i<n;i++){
            if(piles[i]>high)
                high=piles[i];
        }
        int result = high;

        while (low <= high){
            int mid = low + (high - low) / 2;
            int hours = 0;
            for (int pile : piles){
                hours += (pile + mid - 1) / mid;
            }
            if (hours <= h){
                result = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(result);
    }
}