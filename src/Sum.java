/*
There are several cards arranged in a row, and each card has an associated
number of points. The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or fromThere are several
cards arranged in a row, and each card has an associated
number of points. The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the
row. You have to take exactly k cards.Your score is the sum of the points of
the cards you have taken.
Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

Sample Testcase:1
-----------------------
input=1 2 3 4 5 6 1
3
output=12

Explanation:
---------------------
After the first step, your score will always be 1. However, choosing
the rightmost card first will maximize your total score. The optimal strategy is to
take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.

 */
import java.util.*;
class Sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int k=sc.nextInt();
        int max=0;
        for(int i=0;i<=k;i++){
            int l=0,r=0;
            for(int j=0;j<i;j++){
                l=l+a[j];
            }
            for(int j=0;j<k-i;j++){
                r += a[a.length-1-j];
            }
            int sum=l+r;
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}

/*
import java.util.*;
class Sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int min=Integer.MIN_VALUE;
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int k=sc.nextInt();
        int max=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum += a[j];
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}


 */