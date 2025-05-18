/*
You are given an integer array nums. A hill is an element in the array
 that is greater than its neighbors, and a valley is an element that is
 smaller than its neighbors.

Your task is to return the number of hills and valleys in the array.

Sample Testcase:1
-------------------------

input=2 4 1 1 6 5
output=3
Explanation:
----------------------------------

4 is a hill (larger than 2 and 1).
1 (at index 2) is a valley (smaller than 4 and 1).
6 is a hill (larger than 1 and 5).


 */
import java.util.*;
class HillsValleys
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        int h=0;int v=0;
        int c;
        for(int j=1;j<a.length-1;j++)
        {
            if(a[j]>a[j-1] && a[j]>a[j+1])
            {
               h++;
            }
            else if (a[j]<a[j-1] && a[j]<=a[j+1])
            {
                v++;
            }


        }
             c=h+v;
        System.out.println(c);
    }
}
