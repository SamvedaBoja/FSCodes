/*
In a revised game of hopscotch, a child is trying to cross a line of tiles with
a binary string painted on it.
Consider the line of tiles to be like a 1D array, where each tile has either a
1 or a 0, and a consecutive series of tiles making the whole string.
The game starts with the child standing in front of the leftmost character of
the string.All jumps to reach the end of the string can only be on tiles with 0
or only be on tiles with 1.The game is won if the child can reach the end of
the string, taking jumps with the minimum required power.


In 10101, the power of the jump from beginning to the first tile is 1,
but from the first to the third tile is 2 and so on.
Find the minimum power the child's jump should have in order to win the game
for different binary strings.

Note : In one jump, the child can jump to the right, any distance from 1 to
the value of the power of her jump.

For example, for the string 10101, the power of the jump needs to be minimum 2.

Sample Testcase:1
---------------------------------
input=11111
output=1
Explanation :
----------------------------
Since all the string elements are 1, the minimum power of the jump needs to be
1 to cross the string.

 */
import java.util.*;
class Greedy15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.next().split("");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        // int check=a[0];
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        // l.add(0);
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                l.add(i);
            }
            /*
            if(check==a[i]){
                l.add(i);
            }
            */
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                l1.add(i);
            }
            /*
            if(check==a[i]){
                l.add(i);
            }
            */
        }

        int res=1;
        for(int i=1;i<l.size();i++){
            res=Math.max(l.get(i)-l.get(i-1),res);
        }
        int res1=1;
        for(int i=1;i<l1.size();i++){
            res=Math.max(l.get(i)-l.get(i-1),res1);
        }

        System.out.println(Math.min(res,res1));
    }
}
