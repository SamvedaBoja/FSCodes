/*
One day, Sri Krishnadevaraya, the king of Vijayanagara, faced a problem with
arranging a bunch of sticks of unique lengths. Every time he tried to put them in
an order (either in ascending or descending), he had to move sticks in different
positions and he didn’t liked it. So, he summoned, Tenali Raman to tell him
minimum exchanges to be made to arrange the sticks either in ascending or
descending order.
Now, Imagine Raman approached you for a solution with input values in two
different lines. Total number of sticks (n) in the first line and sizes of sticks
separated by space. Write a program to perform that the task mentioned above.

Sample Testcase:1
        -------------------------------
input=4
        6 3 1 9
output=1

Explanation :
        -------------------------------
Swaps needed to sort in increasing order is :1
        9 6 1 3 (6 & 1)
Swaps needed to sort in decreasing order is 3
        9 3 1 6 (9 & 6)
        9 6 1 3 (3 & 6)
        9 6 3 1 (1 & 3)
*/
import java.util.*;
class Greedy14{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int original[]=new int[n];
        for(int i=0;i<n;i++){
            original[i]=sc.nextInt();
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=original[i];
        }
        Arrays.sort(a);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(original[i],i);
        }
        int c1=0;
        for(int i=0;i<a.length;i++){
            if(a[i] != original[i]){
                c1++;
                int swap=hm.get(a[i]);
                hm.put(original[i],swap);
                hm.put(a[i],i);
                int temp=a[i];
                a[i]=a[swap];
                a[swap]=temp;

            }
        }
        int c2=0;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=original[n-i-1];
        }
        for(int i=0;i<b.length;i++){
            if(b[i] != original[i]){
                int swap=hm.get(b[i]);
                hm.put(original[i],swap);
                hm.put(b[i],i);
                int temp=b[i];
                b[i]=b[swap];
                b[swap]=temp;
                c2++;
            }
        }
        System.out.println(Math.min(c1,c2));
    }
}