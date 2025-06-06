
/*
You have given N bricks.
You need to construct a staircase as follows:
1. =
2. ==
3. ===
4. ====
Where = indicates one brick.

Another condition is row-1 should have 1 brick, row-2 should have 2 bricks and so on.
i.e., i-th row should have 'i' bricks.

Your task is to findout total number of staircases can be formed with the given condition.

Input Format:
-------------
 An integer N

Output Format:
--------------
Print an integers, number of staircases


Sample Input-1:
---------------
 5

Sample Output-1:
----------------
2

Explanation:
------------
row-1:	=
row-2:	==
row-3:	==
Only 2 rows satisfies the condition.


Sample Input-2:
---------------
 8

Sample Output-2:
----------------
3

Explanation:
------------
row-1:	=
row-2:	==
row-3:	===
row-4:	==


 */
import java.util.*;
class Staircase{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            n=n-i;
            count++;
        }
        System.out.println(count);
    }
}