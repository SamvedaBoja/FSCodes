/*
There are n children standing in a line. Each child is assigned a rating value
given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:
Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.

Return the minimum number of candies you need to have to distribute the candies
to the children.

Sample Testcase:1
-------------------------------
input=3
1 0 2
output=5
Explanation: You can allocate to the first, second and third child with 2, 1, 2
candies respectively.
 */
import java.util.*;
class Greedy18{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int freq[]=new int[n];
        for(int i=0;i<n;i++){
            freq[i]=1;
        }
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                freq[i]=freq[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(a[i]>a[i+1]){
                freq[i]=Math.max(freq[i],freq[i+1]+1);
            }
        }
        int candies=0;
        for(int i=0;i<n;i++){
            candies += freq[i];
        }
        System.out.println(candies);
    }
}
/*
import java.util.*;
class Greedy18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }

        int[] candies = new int[n];
        Arrays.fill(candies, 1);  // Step 1: give 1 candy to each child

        // Step 2: Left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        System.out.println(totalCandies);
    }
}

 */