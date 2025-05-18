
/*
You are given a 0-indexed string num of length n consisting of digits.

Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.

 You are developing a validation tool for a financial institution that processes account numbers.
 Each account number is represented as a string num of length n, where each character is a digit from '0' to '9'.

-Your task is to ensure that each digit occurs in the string num exactly the number of times equal to its value.

Sample Testcase:1
-------------------------------
input=1210
Output=true
Explanation:
num[0] = '1'. The digit 0 occurs once in num.
num[1] = '2'. The digit 1 occurs twice in num.
num[2] = '1'. The digit 2 occurs once in num.
num[3] = '0'. The digit 3 occurs zero times in num.
The condition holds true for every index in "1210", so return true.

Sample Testcase:2
-------------------------------
input=030
Output:=false
Explanation:
num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
num[2] = '0'. The digit 2 occurs zero times in num.
The indices 0 and 1 both violate the condition, so return false.
*/
import java.util.*;
public class Array1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a[]=new int[10];
        for(char c:s.toCharArray()){
            a[c-'0']++;
        }
        for(int i=0;i<s.length();i++){
            if(a[i]!=s.charAt(i)-'0'){
                System.out.print("false");
                return;
            }
        }
        System.out.print("true");

    }
}
