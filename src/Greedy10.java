/*
Neeraj is given the N in binary format as a string S. Neeraj always
successful in making N to 1.
Your task is to help Neeraj to find the number of steps required to make N  to 1.

Input Format:
-------------
A string S, represents the binary equivalent of N.

Output Format:
--------------
Print an integer as number of steps.


Sample Input-1:
---------------
110

Sample Output-1:
----------------
4

Explanation:
-------------
step-1: N=6, even, so 6/2=3
step-2: N=3, odd,  so 3+1=4
step-3: N=4, even, so 4/2=2
step-4: N=2, even, so 2/2=1
Total steps=4
 */
import java.util.*;
import java.math.BigInteger;
class Greedy10{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int steps=0;
        BigInteger n = new BigInteger(s,2);
        while(!n.equals(BigInteger.ONE)){
            if(n.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
                n = n.divide(BigInteger.TWO);
            }
            else{
                n = n.add(BigInteger.ONE);
            }
            steps++;
        }
        System.out.println(steps);
    }
}