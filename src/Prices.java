
/*
Imagine you are building a stock price prediction tool 📈.

The array represents stock prices recorded at different times.

You want to help users find the next price jump — that is, for each time,
tell the user the next time the stock price rises.

If the stock price never rises again, show -1.

Sample Testcase:1
        ------------------------
input=5
        2 1 2 4 3
Output=4 2 4 -1 -1

 */

import java.util.*;
class Prices
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            while(j<n)
            {
                if(a[i]<a[j])
                {
                    System.out.println(a[j]+" ");
                    break;
                }
                j++;
            }
            if(j==n)
                System.out.println("-1 ");
        }
    }
}