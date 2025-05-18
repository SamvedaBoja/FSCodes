
/*
Given an integer rowIndex, return the rowIndex-th (0-indexed) row of Pascal's Triangle.
In Pascal's Triangle, each number is the sum of the two numbers directly above it.

Sample Testcase:1
------------------------------
input=3
output=[1,3,3,1]
 */
import java.util.*;
public class Pascal {
    public static List<Integer> triangle(int n){
       List<Integer> l = new ArrayList<>();
       l.add(1);
       for(int i=1;i<=n;i++){
           for(int j=l.size()-1;j>=1;j--){
               l.set(j,l.get(j)+l.get(j-1));
           }
           l.add(1);
       }
       return l;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list = triangle(n);
        System.out.println(list);
    }
}

/*
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // First and last element of each row is always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Middle elements are sum of two elements above
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        int numRows = 5; // Change this to generate more rows
        List<List<Integer>> result = generate(numRows);
        printTriangle(result);
    }
}
[1]
[1, 1]
[1, 2, 1]
[1, 3, 3, 1]
[1, 4, 6, 4, 1]
 */