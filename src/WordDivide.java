/*
Mr Rao is given a word.
He has to divide the word into N non-empty parts in such a way that all the
newly formed words should be distinct, and
after appending all those words it should form original word W.

Help Mr Rao to divide the word into N parts,
such that, the value of N should be maximized, and print N.

Input Format:
-------------
Line-1: A string W, a word.

Output Format:
--------------
Print an integer result, the value of N.


Sample Input-1:
---------------
banana

Sample Output-1:
----------------
4

Explanation:
------------
One way to divide the word is "b","a","n","ana".
If you divide it like "b","a","n","an","a".The word "a" will be repeated.
So it is not allowed to divide like the second way.


Sample Input-2:
---------------
mississippi

Sample Output-2:
----------------
7

Explanation:
------------
One of the way to divide the word is "m","i","s","si","ssi","p","pi".

NOTE: Subsequences are not allowed.

 */

import java.util.*;
public class WordDivide
{
    static int maxParts = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Set<String> seen = new HashSet<>();
        solve(word, 0, seen, 0);
        System.out.println(maxParts);
    }
    static void solve(String word, int index, Set<String> seen, int count)
    {
        if (index == word.length())
        {
            maxParts = Math.max(maxParts, count);
            return;
        }
        for (int i = index + 1; i <= word.length(); i++)
        {
            String part = word.substring(index, i);
            if (!seen.contains(part))
            {
                seen.add(part);
                solve(word, i, seen, count + 1);
                seen.remove(part);
            }
        }
    }
}