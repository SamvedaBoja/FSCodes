/*
You are given a 0-indexed array nums of length n.

The distinct difference array of nums is an array diff of length n such that
diff[i] is equal to the number of distinct elements in the suffix nums[i + 1, ..., n - 1]
subtracted from the number of distinct elements in the prefix nums[0, ..., i].

Return the distinct difference array of nums.

Note that nums[i, ..., j] denotes the subarray of nums starting at index i and
ending at index j inclusive. Particularly, if i > j then nums[i, ..., j] denotes
an empty subarray.

Sample Testcase:1
-------------------------------------
input=5
1 2 3 4 5
output=[-3, -1, 1, 3, 5]
Explanation: For index i = 0, there is 1 element in the prefix and 4 distinct
elements in the suffix. Thus, diff[0] = 1 - 4 = -3.
For index i = 1, there are 2 distinct elements in the prefix and 3 distinct
elements in the suffix. Thus, diff[1] = 2 - 3 = -1.
For index i = 2, there are 3 distinct elements in the prefix and 2 distinct
elements in the suffix. Thus, diff[2] = 3 - 2 = 1.
For index i = 3, there are 4 distinct elements in the prefix and 1 distinct
element in the suffix. Thus, diff[3] = 4 - 1 = 3.
For index i = 4, there are 5 distinct elements in the prefix and no elements
in the suffix. Thus, diff[4] = 5 - 0 = 5.


 */
/*
import java.util.*;
class Diiference{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int res[]=new int[n];
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=n;i++){
            int j=0;
            HashSet<Integer> h1= new HashSet<>();
            HashSet<Integer> h2= new HashSet<>();
            for(j=0;j<i;j++){
                h1.add(a[j]);
            }
            while(j<n){
                h2.add(a[j]);
                j++;
            }
            l.add(h1.size()-h2.size());
        }
        System.out.print(l);
    }
}

 */

import java.util.*;

class Diiference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Count distinct elements in prefix
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
            prefix[i] = set.size();
        }

        // Count distinct elements in suffix
        set.clear();
        for(int i = n - 1; i >= 0; i--){
            set.add(nums[i]);
            suffix[i] = set.size();
        }

        // Compute the difference
        int[] diff = new int[n];
        for(int i = 0; i <n; i++){
            int suff = (i == n - 1) ? 0 : suffix[i + 1];
            diff[i] = prefix[i] - suff;
        }

        System.out.println(Arrays.toString(diff));
    }
}
