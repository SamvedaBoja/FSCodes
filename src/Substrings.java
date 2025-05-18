/*
There are some cubes, each cube is printed with an alphabet [A-Z].
Using these cubes, you can create non-empty distinct words.
and length of the words should be 0< length <= no.of.cubes.

You are given a string of alphabets S,
Your task is to findout number of possible non-empty distinct words

Input Format:
-------------
A string S, consist of A-Z letters only.

Output Format:
--------------
Print an integer, number of possible non-empty distinct words.


Sample Input-1:
---------------
EGG

Sample Output-1:
----------------
8

Explanation:
--------------
The possible distinct words are "E", "G", "EG", "GG", "GE", "EGG", "GEG", "GGE".


Sample Input-2:
---------------
MADAM

Sample Output-2:
----------------
89
 */
import java.util.*;
public class Substrings{
    static Set<String> result = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean[] used = new boolean[input.length()];
        generateWords(input.toCharArray(), "", used);
        System.out.println(result.size());
    }
    public static void generateWords(char[] letters, String current, boolean[] used){
        if (!current.isEmpty()){
            result.add(current);
        }
        for (int i = 0; i < letters.length; i++){
            if (used[i])
                continue;
            used[i] = true;
            generateWords(letters, current + letters[i], used);
            used[i] = false;
        }
    }
}