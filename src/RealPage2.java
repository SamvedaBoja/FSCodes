/*

You are given an array of strings arr. A string s is formed by the
concatenation of a subsequence of arr that has unique characters.

Return the maximum possible length of s.

A subsequence is an array that can be derived from another array by deleting
some or no elements without changing the order of the remaining elements.

Sample Testcase:1
----------------------------------------
input=un iq ue
output=4

Explanation:
-----------------------------------------
All the valid concatenations are:
- ""
- "un"
- "iq"
- "ue"
- "uniq" ("un" + "iq")
- "ique" ("iq" + "ue")
Maximum length is 4.


 */

import java.util.*;
import java.util.Arrays;
public class RealPage2
{
    static int maxLen = 0;
    public static int maxLength(List<String> arr)
    {
        backtrack(arr, 0, "");
        return maxLen;
    }
    private static void backtrack(List<String> arr, int index, String current)
    {
        if (!isUnique(current)) return;
        maxLen = Math.max(maxLen, current.length());
        for (int i = index; i < arr.size(); i++)
        {
            backtrack(arr, i + 1, current + arr.get(i));
        }
    }
    private static boolean isUnique(String s)
    {
        boolean[] seen = new boolean[26];
        for (char c : s.toCharArray())
        {
            if (seen[c - 'a']) return false;
            seen[c - 'a'] = true;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] input = line.trim().split("\\s+");
        List<String> arr = Arrays.asList(input);
        int result = maxLength(arr);
        System.out.println(result);
    }
}
