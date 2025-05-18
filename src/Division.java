
/*
You are given an integer N,
You need to apply the following conditions on first N natural numbers.
where 1<=k<=N.
	1. If k is divisible by 2 print Fizz
	2. If k is divisible by 3 print Buzz
	3. If k is divisible by 5 print Jazz
	4. If k is divisible by both 2 & 3 only print FizzBuzz
	5. If k is divisible by both 3 & 5 only print BuzzJazz
	6. If k is divisible by both 5 & 2 only print JazzFizz
	7. If k is divisible by both 2, 3 & 5 print FizzBuzzJazz
If none of the conditions satisfied print k.


Input Format:
-------------
An integer N

Output Format:
--------------
Print the output as shown in testcase.


Sample Input-1:
---------------
10

Sample Output-1:
----------------
[1, Fizz, Buzz, Fizz, Jazz, FizzBuzz, 7, Fizz, Buzz, JazzFizz, 11, FizzBuzz, 13, Fizz, BuzzJazz]


Sample Input-2:
---------------
15

Sample Output-2:
----------------
[1, Fizz, Buzz, Fizz, Jazz, FizzBuzz, 7, Fizz, Buzz, JazzFizz, 11, FizzBuzz, 13, Fizz, BuzzJazz]


 */
import java.util.*;
class Division{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> a=new ArrayList<>();
        int i=1;
        while(i<=n){
            if(i%3==0 && i%5==0 && i%2==0){
                a.add("FizzBuzzJazz");
            }
            else if(i%2==0 && i%5==0){
                a.add("JazzFizz");
            }
            else if(i%3==0 && i%5==0){
                a.add("BuzzJazz");
            }
            else if(i%2==0 && i%3==0){
                a.add("FizzBuzz");
            }
            else if(i%2==0){
                a.add("Fizz");
            }
            else if(i%3==0){
                a.add("Buzz");
            }
            else if(i%5==0){
                a.add("Jazz");
            }
            else
                a.add(Integer.toString(i));
            i++;
        }
        System.out.print(a);
    }
}
