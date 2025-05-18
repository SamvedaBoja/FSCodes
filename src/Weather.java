
/*

You are building a Weather Forecast App ☀️🌧️.

Users want to know how many days it will take for the weather to become warmer starting from today.

You will provide an array of answers showing, for each day, how many days to wait.

If it never gets warmer, show 0.

Sample Testcase:1
-----------------------------
input:8
73 74 75 71 69 72 76 73
output:1 1 4 2 1 1 0 0
 */
import java.util.*;
class Weather
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
            int j;
            for(j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    System.out.print(j-i+" ");
                    break;
                }
            }
            if(j==n)
                System.out.print("0 ");
        }
    }

}