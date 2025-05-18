/*
You are given three sorted arrays A, B, and C. Your task is to find the minimum possible value of:
abs(max⁡(A[i],B[j],C[k])−min⁡(A[i],B[j],C[k]))
where A[i] belongs to array A, B[j] belongs to array B, and C[k] belongs to array C.

Sample Testcase:1
----------------------------------
input=
A=1 4 10 15     (size = 4)
B=2 15 20        (size = 3)
C=10 12 30 35 40 (size = 5)
output=3


 */
import java.util.*;

public class MinDiff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array A
        int n1 = sc.nextInt();
        int[] A = new int[n1];
        for (int i = 0; i < n1; i++) A[i] = sc.nextInt();

        // Read array B
        int n2 = sc.nextInt();
        int[] B = new int[n2];
        for (int i = 0; i < n2; i++) B[i] = sc.nextInt();

        // Read array C
        int n3 = sc.nextInt();
        int[] C = new int[n3];
        for (int i = 0; i < n3; i++) C[i] = sc.nextInt();

        int i = 0, j = 0, k = 0;
        int minDiff = Integer.MAX_VALUE;

        while (i < n1 && j < n2 && k < n3) {
            int minVal = Math.min(A[i], Math.min(B[j], C[k]));
            int maxVal = Math.max(A[i], Math.max(B[j], C[k]));
            int currentDiff = maxVal - minVal;

            minDiff = Math.min(minDiff, currentDiff);

            // Move the pointer of the array which has the minimum value
            if (minVal == A[i]) {
                i++;
            } else if (minVal == B[j]) {
                j++;
            } else {
                k++;
            }
        }

        System.out.println(minDiff);
    }
}
