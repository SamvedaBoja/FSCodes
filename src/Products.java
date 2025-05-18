/*
A retail store is analyzing its sales data to understand customer purchase patterns.
 The store tracks the product IDs of sold items throughout the day in a time-ordered sequence.

Given a list of sold product IDs and a window size k, the store wants to determine
how many unique products were sold in each window of k consecutive sales.

Your task is to compute the count of distinct product IDs in every sliding window of size k.

Sample Testcase:1
----------------------------
input=10
7 8 9 7 8 9 10 11 12 13
output=5

 */
/*
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        /*
        int l=0,r=0;
        while(r<=a.length){
            int count=0;
            for(r=0;r<k;r++){
                for(int j=0;j<k;j++){
                    if(a[r]!=a[j]){
                        count++;
                    }
                }
            }
            System.out.print(count+" ");
            r++;
        }
        */

/*
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=i;j<k;j++){
                for(int l=j;l<k;l++){
                    if(a[j]!=a[l]){
                        count++;
                    }
                }
            }
            System.out.print(count+" ");
        }
    }
}
*/
import java.util.*;

public class Products {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size
        int n = sc.nextInt();

        // Read the list of product IDs
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read window size k
        int k = sc.nextInt();

        // HashMap to store frequency of elements in current window
        Map<Integer, Integer> map = new HashMap<>();

        // Initialize first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Print count of distinct elements in the first window
        System.out.print(map.size() + " ");

        // Slide the window
        for (int i = k; i < n; i++) {
            // Remove the first element of previous window
            int out = arr[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }

            // Add the new element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // Print count of distinct elements in current window
            System.out.print(map.size() + " ");
        }
    }
}