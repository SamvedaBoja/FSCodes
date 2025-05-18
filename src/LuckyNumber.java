/*

Imagine you are a software developer working for a large gaming company. The company is developing
a new game where players can collect special items called "Lucky Charms." These Lucky Charms are
represented by unique numbers. To make the game more interesting, the company has decided to use
a special sequence known as "Lucky Numbers" to determine which numbers can be Lucky Charms.

The game's rules for determining Lucky Numbers are as follows:

-Start with a list of integers beginning from 1 and continue indefinitely.
-Eliminate every second number from the list.
-The second remaining number (after the first elimination) determines the next step: eliminate
every number at that position from the new list.
-Continue this process iteratively: the next smallest number in the remaining list determines
 the next elimination step.
-Your task is to generate numbers upto n.

Example:
-----------------------------------
Begin with a list of integers starting with 1 :
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, . . . .
Now eliminate every second number :
1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, ...
The second remaining number is 3, so remove every 3rd number:
1, 3, 7, 9, 13, 15, 19, 21, 25, ...
The next remaining number is 7, so remove every 7th number:
1, 3, 7, 9, 13, 15, 21, 25, ...
Next, remove every 9th number and so on.


Sample Testcase:1
---------------------------------
input=10
output=1 3 7
Explanation:
-------------------------------
1 3 5 7 9
1 3 7 9
1 3 7
*/
import java.util.*;

public class LuckyNumber  {

    public static List<Integer> generateLuckyNumbers(int n) {
        List<Integer> list = new ArrayList<>();

        // Step 1: Fill the list with numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int idx = 1; // Start with the second element (index 1)

        // Step 2: Iteratively eliminate elements based on the current lucky number
        while (idx < list.size()) {
            int step = list.get(idx); // This determines the step size for elimination
            if (step > list.size()) break; // If step exceeds list size, break loop

            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if ((i + 1) % step != 0) {
                    temp.add(list.get(i));
                }
            }
            list = temp;
            idx++;
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> luckyNumbers = generateLuckyNumbers(n);
        for (int num : luckyNumbers) {
            System.out.print(num + " ");
        }
    }
}
 
