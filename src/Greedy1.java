/*

A bank is upgrading its ATM machines to support faster and more
 efficient cash distribution. During testing, engineers discovered
that the ATM splits a 4-digit withdrawal amount into individual digits
and then rearranges them to form two 2-digit denominations to be dispensed (e.g., ₹20 and ₹32).

To optimize the number of notes used and reduce machine load, the
software must compute the minimum possible sum of these two new
2-digit values, ensuring the digits are reused once and only once.

Sample Testcase:1
----------------------
input=2932
output=52

Explanation:
---------------------
Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.


 */

import java.util.*;
class Greedy1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[4];
        for(int i = 0; i < 4; i++)
        {
            a[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(a);
        int x = a[0]*10 + a[2];
        int y = a[1]*10 + a[3];
        System.out.println(x + y);
    }
}