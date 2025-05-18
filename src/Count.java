/*
Mr.Kate is a school kid, writing a series of numbers in a special way.

The series looks like following:
	- For example, starting number is 25
	- Next number in the series is, count of digit groups like "one 2 and one 5', written as 1215.
	- Next number in the series is, count of digit groups like "one 1, one 2, one 1 and one 5',
	written as 11121115 and so on.

You will be given a string S (A number), an integer N, where S is the starting number of series,
You need to find the N-th term in the series.

Note: Each term of the series of integers will be represented as a string.

Input Format:
-------------
A String S and an integer N

Output Format:
--------------
Print the N-th term in the series starts with S.


Sample Input-1:
---------------
25 3

Sample Output-1:
----------------
11121115


Sample Input-2:
---------------
21 4

Sample Output-2:
----------------
132112

Explanation:
---------------
1st term, S = 12
2nd term is "one 2 one 1" -> "1211",
3rd term is "one 1, one 2, two 1's " -> "111221"
Finally 4th term is  "three one's, two 2's, one 1" -> "312211".

 */
import java.util.*;
class Count{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        for(int k=1;k<n;k++){
            StringBuilder r=new StringBuilder();
            int count=1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1))
                    count++;
                else{
                    r.append(count).append(s.charAt(i-1));
                    count=1;
                }
            }
            r.append(count).append(s.charAt(s.length()-1));
            s=r.toString();
        }
        System.out.print(s);
    }
}