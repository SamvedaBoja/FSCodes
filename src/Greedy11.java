/*

Assume you are an awesome parent and want to give your children some cookies.
But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that
the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i],
 we can assign the cookie j to the child i, and the child i will be content.

 Your goal is to maximize the number of your content children and output the maximum number.


Sample Testcase:1
------------------------------
input=1 2 3
1 1
output=1

Explanation:
-----------------------------
You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
And even though you have 2 cookies, since their size is both 1, you could only make
the child whose greed factor is 1 content.
 */
import java.util.*;
class Greedy11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int arr[]=new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }
        String s1[]=sc.nextLine().split(" ");
        int arr1[]=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            arr1[i]=Integer.parseInt(s1[i]);
        }
        int count=0;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int i=0;
        int j=0;
        while(i<arr.length&&j<arr1.length){
            if(arr1[j]>=arr[i]){
                count++;
                i++;
                j++;
            }
            else
                j++;
        }
        System.out.print(count);
    }
}