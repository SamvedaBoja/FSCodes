
/*
There are numerous possible combinations of HTML colour codes, and each one is
given a specific identification number. Each codes[i] in the list, codes[], is
an HTML colour code that was chosen by the web designer. The list may contain
duplicate codes.

The web designer's customer made the decision to eliminate P number of
consecutive codes from the list. However, the web designer wants to preserve
as many distinctive colour codes as he can. Find out how many unique colour
codes the web designer can preserve, and print the count of unique color codes.

Input Format:
---------------------------
Line-1 lenght of array
Line-2 Array elements which are space seperated
Line-3 Size of 'P'

Output Format:
--------------------------
An Integer

Sample Testcase:1
-------------------------------------
input=8
2 3 2 6 3 3 7 1
4
output=4

Explanation:
--------------------
The unique color code he can preserve are [2,3,7,1] by
removing [2,6,3,3]
 */
import java.util.*;
class ColourCodes{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int p=sc.nextInt();
        int max=0;
        for(int i=0;i<=n-p;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<i;j++){
                hs.add(a[j]);
            }
            for(int j=i+p;j<n;j++){
                hs.add(a[j]);
            }
            max=Math.max(max,hs.size());
        }
        System.out.println(max);
    }
}
/*
import java.util.*;

class UniqueColorPreserve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input reading
        int n = Integer.parseInt(sc.nextLine());
        String[] parts = sc.nextLine().split(" ");
        int[] codes = new int[n];
        for (int i = 0; i < n; i++) {
            codes[i] = Integer.parseInt(parts[i]);
        }
        int P = Integer.parseInt(sc.nextLine());

        // Step 1: Count total frequency of each color code
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int code : codes) {
            freqMap.put(code, freqMap.getOrDefault(code, 0) + 1);
        }

        // Step 2: Try removing each possible window of size P
        int maxUnique = 0;
        for (int i = 0; i <= n - P; i++) {
            Map<Integer, Integer> tempMap = new HashMap<>(freqMap);

            // Remove frequencies of window elements
            for (int j = i; j < i + P; j++) {
                int code = codes[j];
                tempMap.put(code, tempMap.get(code) - 1);
                if (tempMap.get(code) == 0) {
                    tempMap.remove(code); // Completely removed
                }
            }

            // Count how many unique codes are left
            maxUnique = Math.max(maxUnique, tempMap.size());
        }

        // Output
        System.out.println(maxUnique);
    }
}
 */