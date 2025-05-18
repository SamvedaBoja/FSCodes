
/*
Rohan has an array of integers in sorted order initially.
He need to search for an element E in that array.

Rohan has shifted a part of the beginning of the array to end of the array.

For example:
Initially, the array is : 1 2 3 4 5 6,
and a part of the beginning 1 2 3 4 is shifted
After shiting the array is : 5 6 1 2 3 4

Your task is to help Rohan , to search E, in the shifted array.
If you found print its index, otherwise print -1.

Input Format:
-------------
Line-1 -> An integer N, number of elements
Line-2 -> N space separated integers, shifted array
Line-3 -> An integer E, search element.

Output Format:
--------------
Print the index postion if you found E,
Otherwise, print -1.


Sample Input-1:
---------------
7
14 16 18 1 2 4 13
16

Sample Output-1:
----------------
1

Sample Input-2:
---------------
7
14 16 18 1 2 4 13
12

Sample Output-2:
----------------
-1


 */
import java.util.*;

class Shift{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int left = 0, right = n - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == target) {
                index = mid;
                break;
            }

            // Left half is sorted
            if (a[left] <= a[mid]) {
                if (a[left] <= target && target < a[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (a[mid] < target && target <= a[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        System.out.println(index);
    }
}