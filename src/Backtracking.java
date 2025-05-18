
/*
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Sample Testcase:1
----------------------------------------
input=1 2 3
output=[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]


 */
/*
import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        System.out.println(result);
        }
    public static void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++){
            current.add(nums[i]);
            backtrack(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}
*/
import java.util.*;

public class Backtracking{
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums){
            int size = result.size();
            for (int i = 0; i < size; i++){
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        List<List<Integer>> output = subsets(nums);
        System.out.println(output);
    }
}