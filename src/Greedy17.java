/*
You are assigned to put some amount of boxes onto one truck.
You are given a 2D array boxTypes, where
boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

numberOfBoxesi is the number of boxes of type i.
numberOfUnitsPerBoxi is the number of units in each box of the type i.

You are also given an integer truckSize, which is the maximum number
of boxes that can be put on the truck. You can choose any boxes to put
on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.

Sample Testcase:1
---------------------------
input=3 //no of boxes
1 3  //box types
2 2
3 1
4  //truckSize
output=8
Explanation:
-------------------------
There are:
- 1 box of the first type that contains 3 units.
- 2 boxes of the second type that contain 2 units each.
- 3 boxes of the third type that contain 1 unit each.
You can take all the boxes of the first and second types, and one box
of the third type.
The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
 */
/*
import java.util.*;
class Greedy17{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        int size=sc.nextInt();
        int units=0;
        Arrays.sort(a,(x,y) -> y[1]-x[1]);
        for(int i=0;i<n;i++){
            int x=a[i][0];
            int y=a[i][1];
            int min=Math.min(x,size);
            units += min*y;
            size = size-min;
        }
        System.out.println(units);
    }
}

 */