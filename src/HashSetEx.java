/*
You are the curator of a digital museum of artifacts, and you begin with one rare artifact labeled n.
Every day, based on each artifact currently in the museum, you examine all possible labels from 1 to n
and use the following rule to discover new artifacts:

If the current artifact's label x leaves a remainder of 1 when divided by a label i (1 <= i <= n),
then artifact i is considered related and is added to the museum (if not already present).

Once an artifact is added to the museum, it stays there permanently.

This discovery process continues every day for a very long time — say, a billion days.
However, once no more new artifacts are added, the museum stabilizes.
Your task is:
Given the starting artifact labeled n, determine how many distinct artifacts will be in the museum
after all possible discoveries are made.

Sample Testcase:1
-----------------------------------
input=5
output=4
Explanation:
---------------------------
Initially, 5
The next day, 2 and 4 will be added since 5 % 2 == 1 and 5 % 4 == 1.
After that day, 3 will be added to the board because 4 % 3 == 1.
At the end of a billion days, the distinct numbers will be 2, 3, 4, and 5.

Sample Testcase:2
-----------------------------------
input=3
output=2

Explanation:
-----------------------------------
Since 3 % 2 == 1, 2 will be added to the board.
After a billion days, the only two distinct numbers  are 2 and 3.
*/
/*
import java.util.*;
class HashSetEx{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> hs= new HashSet<>();
        Queue<Integer> q= new LinkedList<>();
        hs.add(n);
        q.add(n);
        while(!q.isEmpty()){
            int num = q.poll();
            for(int i=1;i<=n;i++){
                if(num%i == 1 && !hs.contains(i)){
                    hs.add(i);
                    q.add(i);
                }
            }
        }
        System.out.println(hs.size());
    }
}
*/
import java.util.Scanner;
public class HashSetEx{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        String res=s[0];
        for (int i=1;i<s.length;i++){
            while(!s[i].startsWith(res)){
                res=res.substring(0,res.length()-1);
                if (res.isEmpty()){
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println(res);
    }
}