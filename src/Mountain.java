/*
You are given an integer mountain array arr of length n where the values
increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.

Sample Testcase:1
-------------------------------
input=3
0 1 0
output=1


 */
import java.util.*;
class Mountain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input size
        int[] arr = new int[n]; // Input array
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int peakIndex = findPeakIndex(arr);
        System.out.println(peakIndex);
    }
    public static int findPeakIndex(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
}