/*
Given two integers n and k, return all possible combinations of k numbers
chosen from the range [1, n].


Sample Testcase:1
-------------------------------
input=4 2
output=[[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
Explanation: There are 4 choose 2 = 6 total combinations.

Note that combinations are unordered, i.e., [1,2] and [2,1] are considered
to be the same combination.
 */

import java.util.*;
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current)); // Add a copy of current combination
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrack(i + 1, n, k, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }

    // Sample test
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int  k = sc.nextInt();
        List<List<Integer>> combinations = combine(n, k);
        System.out.println(combinations);
    }
}