/*
Write a function solution that, given an integer N returns the maximum
possible value obtainable by deleting one '5' digit from the decimal
representation of N.
It is guaranteed that N will contain at least one '5' digit.

Given N = 15958, the function should return 1958
N=-5859, the function should return -589
N=-5000, the function should return 0.
deleting the '5', the only digits in the number are zeroes
so its value is 0

Assume that
 N is an integer within the range
 [-999,995..999,995]
 N contains at least one '5' digit in its decimal representation;
 N consists of atleast two digits in its decimal representation;

 In your solution, focus on correctness.
 The performance of your solution will not be the focus of the assessment.

Sample Testcase:1
----------------------------------
input=15958
output=1958

 */
import java.util.*;
public class RealPage {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = solution(n);
        System.out.println(result);
    }
    public static int solution(int n){
        String s = Integer.toString(n);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='5'){
                String str = s.substring(0,i)+s.substring(i+1);
                if(str.equals("") || str.equals("-")){
                    continue;
                }
                int val = Integer.parseInt(str);
                if(n<0){
                    max=Math.max(max,val);
                }
                else{
                    max=Math.max(max,val);
                }
            }
        }
        if(max==Integer.MIN_VALUE)
            return 0;
        return max;
    }
}
