/*
Imagine you are organizing a treasure hunt game. Each participant is assigned a number, and you want to form teams such that the sum of two participants’ numbers matches a given target score. Your goal is to find out how many unique teams can be formed based on the given numbers and target score.

Input Format:
-----------------------------------
An integer array arr[] representing the participant numbers.
An integer targetSum representing the required sum.

Output Format:
-----------------------------------
An integer representing the number of valid pairs whose sum is equal to targetSum.

Sample Testcase:1
---------------------------
Input=1 5 7 -1 5
6
Output=3
Explanation:
---------------------------
The pairs are (1, 5), (7, -1), and (1, 5) (since there are two 5s).

Example 2:
Input:2 3 4 6 8 -2
6
Output=2

Explanation:
----------------------------
The valid pairs are (2, 4) and (8, -2).


 */
import java.util.*;
class TargetSum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String []s=sc.nextLine().split(" ");
        int a[]= new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int target=sc.nextInt();
        int count=0;
        Arrays.sort(a);
        int left=0;
        int right=a.length-1;
        for(int i=0;i<a.length-1;i++){
            while(left<right){
                int n;
                n=a[left]+a[right];
                if(n==target){
                    count++;
                    left++;
                    right--;
                }
                else if(n>target)
                        right--;
                else
                        left++;
            }
        }
        System.out.println(count);
    }
}
