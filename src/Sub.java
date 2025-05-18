
/*

"Axcent Academy" has arranged for a competitive test for medical students from rural
villages. Those successful students of the test will be awarded the scholarship for
their NEET preparations at Axcent Academy. Benny, the co-coordinator and founder of
the academy has given one problem for the first stage of the test. The problem goes
like this:

Given an array A1, A2, ..., AN, count the number of subarrays of array A which are
non-decreasing.
A subarrayA[i, j], where 1 ≤ i ≤ j ≤ N is a sequence of integers Ai, Ai+1, ..., Aj.
A subarrayA[i, j] is non-decreasing if Ai ≤ Ai+1 ≤ Ai+2 ≤ ... ≤ Aj. Count the total
number of such subarrays.

Benny himself has not computed the solution of the problem. Write a program to help him
find the answer for the same to evaluate the students.

Input Format:
The first line of input contains a single integer N denoting the size of array. Assume
that the maximum value for N as 50.
The second line contains N space-separated integers A1, A2, ...,AN denoting the elements
of the array.

Output Format:
-----------------------
Output in a single line, the count of the total number of such subarrays.


Sample Testcase:1
----------------------
4
1 4 2 3
output=6

Sample Testcase:2
----------------------
3
3 1 4
output=4
*/
import java.util.*;
class Sub

{


    public static void main(String []args)

{


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a =new int[n];
        for(int i=0;i<n;i++)

{


            a[i]=sc.nextInt();


}
        int count=n;
        int i=0;
        for(int j=i+1;j<n;j++)

{


            int temp=i;
            while(i<n &&j<n&&temp<n&&a[temp]<a[j])

{


                count+=1;
                temp++;
                j++;


}
            i++;


}
        System.out.println(count);


}

}
 