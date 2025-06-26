/*

A pizza delivery boy got X orders to be delivered on his first day at work.
The position of X locations is given in (a,b) co‑ordinates,
and the boy’s speed is given in units per minute.

Find the maximum of the total traveling time it would take from one place to another.

Note: Use Euclidean’s method to calculate the distance between two points.
Euclidean Distance is defined as:


sqrt[(b2 - b1)^2 + (a2 - a1)^2]

Input Specification:
--------------------
 input1: Speed of Dan
 input2: Value of X
 input3: A 2‑D array consisting of (x,y) co‑ordinates of X locations

Output Specification:
---------------------
Return maximum traveling time among all the points. The answer should be rounded
off to 6 decimal places.



Example 1:
----------
input=2
3
0 0
0 2
2 0
output=1.414214

Explanation:
-------------
The maximum distance is between points (0,2) and (2,0), which is 2.828428.
Dan’s speed is 2, so time taken = 1.414214.
 */


import java.util.*;
class Drive3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double s=sc.nextDouble();
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        double maxdist = 0.0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x = a[i][0]-a[j][0];
                int y = a[i][1]-a[j][1];
                double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
                maxdist = Math.max(dist,maxdist);
            }
        }
        double time = maxdist/s;
        System.out.printf("%.6f\n",time);
    }
}


