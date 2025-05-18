import java.util.*;
public class Subarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        int a[]=new int[str.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(str[i]);
        }
        int target=sc.nextInt();
        int l=0,r=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        while(r<a.length){
            sum += a[r];
                r++;
            while(sum >= target){
                minlen = Math.min(minlen,r-l);
                sum -= a[l];
                l++;
            }

        }
        System.out.println(minlen);
    }
}
/*
import java.util.*;

class Subarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] a = str.split(" ");
        int n = a.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }

        int target = sc.nextInt();
        int minLength = Integer.MAX_VALUE;
        int sum = 0, start = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}
 */