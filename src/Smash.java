
/*
You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones
and smash them together. Suppose the heaviest two stones have weights x and y with x <= y.
 The result of this smash is:

If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left,
 return 0.

Sample Testcase:1
-------------------------------
input=2 7 4 1 8 1
output=1

Explanation:
-------------------
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

Sample Testcase:2
-------------------------------
input=1
Output=1

 */
import java.util.*;
class Smash{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            arr.add(a[i]);
        }
        while(arr.size()>1){
            Collections.sort(arr);
            int s1=arr.remove(arr.size()-1);
            int s2=arr.remove(arr.size()-1);
            if(s1!=s2){
                arr.add(s1-s2);
            }
        }
        if(!arr.isEmpty()){
            System.out.println(arr.remove(arr.size()-1));
        }
        else
            System.out.println(0);
    }
}
