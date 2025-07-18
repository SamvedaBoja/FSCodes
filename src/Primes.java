/*
You are tasked with sorting a list of identification numbers based on the frequency of
 prime digits in each number. The prime digits are 2, 3, 5, and 7. The sorting should
 be done in descending order of prime digits. If two numbers have the same number of
 prime digits, maintain the original order.

Input:
---------------------------
A list of identification numbers (positive integers).

Output:
--------------------------
A list of the identification numbers sorted based on the frequency of prime digits in
each number in descending order. For numbers with the same frequency of prime digits,
their relative order should remain the same as in the input list.

Sample Input:
---------------------
input=123 45 67 89
output=89 45 67 123

Explanation:
----------------------------
123 has two prime digits (2, 3).
45 has one prime digit (5).
67 has one prime digit (7).
89 has no prime digits.
After sorting based on the frequency of prime digits, we get 89 first (as it has zero prime digits),
followed by 45 and 67 (both with one prime digit), and 123 comes last with two prime digits.
 */
import java.util.*;
import java.util.Arrays;
public class Primes {
    // Function to count prime digits in a string
    public static int countPrimeDigits(String num) {
        int count = 0;
        for (char c : num.toCharArray()) {
            if (c == '2' || c == '3' || c == '5' || c == '7') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        // Step 1: Store input with their prime digit count
        List<String> list = Arrays.asList(input);

        // Step 2: Sort using a stable comparator (Java sort is stable for List)
        list.sort((a, b) -> {
            int countA = countPrimeDigits(a);
            int countB = countPrimeDigits(b);
            return Integer.compare(countA, countB); // ascending order
        });

        // Step 3: Print in descending order
       // Collections.reverse(list); // now in descending order
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
/*
/*
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");

        HashMap<String,Integer> hm = new HashMap<>();
        for(String str: s){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == '2' || str.charAt(i) == '3'||str.charAt(i) == '5'||str.charAt(i) == '7'){
                    count++;
                }
            }
            hm.put(str,count);
        }
        for(int i=0;i<hm.size();i++){
            for(String k:hm.keySet()){
                if(hm.get(k)==i)
                    System.out.print(k+" ");
            }
        }

    }
}

import java.util.*;
public class Test{
    public static int countPrime(String num){
        int count = 0;
        for (char c : num.toCharArray()){
            if (c == '2' || c == '3' || c == '5' || c == '7'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        List<String> list = Arrays.asList(input);
        list.sort((a, b) -> {
            int countA = countPrime(a);
            int countB = countPrime(b);
            return Integer.compare(countA, countB);
        });

        for (String s : list){
            System.out.print(s + " ");
        }
    }
}
 */