/*
You have a water dispenser that can dispense cold, warm,
and hot water. Every second, you can either fill up 2
cups with different types of water, or 1 cup of any type
of water.

You are given a 0-indexed integer array amount of length
 3 where amount[0], amount[1], and amount[2] denote the
number of cold, warm, and hot water cups you need to fill
 respectively. Return the minimum number of seconds needed
to fill up all the cups.

Sample Testcase:1
----------------------------
input=1 4 2
output=4
Explanation:
----------------------------
One way to fill up the cups is:
Second 1: Fill up a cold cup and a warm cup.
Second 2: Fill up a warm cup and a hot cup.
Second 3: Fill up a warm cup and a hot cup.
Second 4: Fill up a warm cup.
It can be proven that 4 is the minimum number of seconds needed.


 */
import java.util.*;
import java.util.Arrays;
class Greedy3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int sum=0;
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        int max=a[2];
        int min = Math.max(max,(sum+1)/2);

        System.out.println(min);
    }
}
/*
import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        int sum=0;
        for(int i=0;i<s.length;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            sum += a[i];
        }
        Arrays.sort(a);
        int max = a[2];
        int minSeconds = Math.max(max, (sum + 1) / 2);
        System.out.println(minSeconds);
    }
}
 */