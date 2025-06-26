/*
You write a love letter to your friend. However, before your friend can read it.
someone else takes it and rotates the characters of
each word left to right K times. Find the number of words that remain the same
even after this shifting of letters.

Note: There can be more than one spaces between the words.

Input Specification:
-------------------
input1: String of words

input2: K. number of times rotation happens

Output Specification:
---------------------
Your function should return the number of correct words.

Example 1:
----------
input1: llohe ereth

input2: 2

Output: 0

Explanation:
-------------
In examplet llohe ereth is a rotated string, mence the original string was
hello there which is not correct. Hence answer is 0.

Example 2:
----------
input1: adaada

input2: 3

Output:1

Explanation:
------------
inexample 2 adaada when rotated 3 times gives back "adaada". Hence answer is 1

 */
/*
import java.util.*;
class Drive2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int len = s.length();
        n = n%len;
        String rotated = s.substring(n)+s.substring(0,n);
        System.out.println(rotated);
        if(s.equals(rotated)){
            System.out.print('1');
        }
        else{
            System.out.println('0');
        }
    }
}
*/
public class Drive2 {

    public static void main(String[] args) {
        String input1 = "adaada";
        int input2 = 3;
        System.out.println(countSameAfterRotation(input1, input2)); // Output: 1
    }

    public static int countSameAfterRotation(String input, int k) {
        if (input == null || input.isEmpty()) return 0;

        String[] words = input.trim().split("\\s+"); // Split by 1 or more spaces
        int count = 0;

        for (String word : words) {
            if (word.length() == 0) continue;
            if (rotateRight(word, k).equals(word)) {
                count++;
            }
        }

        return count;
    }

    private static String rotateRight(String word, int k) {
        int len = word.length();
        if (len == 0) return word;

        k = k % len; // To avoid unnecessary full cycles

        // Right rotation: take last k chars + rest of the word
        return word.substring(len - k) + word.substring(0, len - k);
    }
}