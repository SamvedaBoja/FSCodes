
/*
Students are given sentences in the target language where vowels and consonants
within each word are jumbled. They need to rearrange the words so that vowels
appear to the left of consonants within each word, and the words are sorted based on this pattern.

Sample Testcase:1
        -------------------------------
input=a man is happy if he codes everyday
        output=a amn is ahppy if eh eocds aeedrvyy

Sample Testcase:2
        -------------------------------
input=honesty is the best policy
        output=eohnsty is eht ebst ioclpy


 */

import java.util.*;

public class RearrangeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();  // Input sentence
        String[] words = line.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder vowels = new StringBuilder();
            StringBuilder consonants = new StringBuilder();
            for (char ch : word.toCharArray()) {
                if (isVowel(ch)) {
                    vowels.append(ch);
                } else {
                    consonants.append(ch);
                }
            }
            result.append(vowels).append(consonants).append(" ");
        }

        System.out.println(result.toString().trim());  // Final output
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}