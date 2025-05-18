/*

Stella and friends have set out on a vacation to Manali. They have booked
accommodation in a resort and the resort authorities headed by Bob, organize
 Campfires every night as a part of their daily activities. Stella volunteered
herself for an activity called the "Stick Game".

Stella was given a total of N sticks. The length of i-th stick is Ai. Bob
insists Stella choose any four sticks and make a rectangle with those sticks
 as its sides. Bob warns Stella not to break any of the sticks, she has to use
 sticks as a whole.

Also, Bob wants that the rectangle formed should have the maximum possible area
 among all the rectangles that Stella can make. Stella takes this challenge up
and overcomes it. You have to help her know whether it is even possible to create
 a rectangle. If yes, then tell the maximum possible area of the rectangle.

Input Format:
------------------------
The first line of the input contains a single integer N denoting the number of sticks.
The second line of each test case contains N space-separated integers A1, A2, ...,AN
denoting the lengths of sticks.

Output Format:
------------------------
Output a single line containing an integer representing the maximum possible area
for rectangle or output -1, if it's impossible to form any rectangle using the
available sticks.


Sample Testcase:1
----------------------
5
1 2 3 1 2
output=2

Sample Testcase:2
----------------------
4
1 2 2 3
output=-1
*/
import java.util.*;
class Area{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        HashMap<Integer,Integer>hash=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            hash.put(a[i],hash.getOrDefault(a[i],0)+1);
        }
        int c=0;
        for(int k:hash.keySet()){
            if(hash.get(k)>=2){
                c+=1;
            }
        }
        if(c<2){
            System.out.println(-1);
            return;
        }
        int t[]=new int[c];
        int j=0;
        for(int k:hash.keySet()){
            if(hash.get(k)>=2){
                t[j]=k;
                j++;
            }
        }
        Arrays.sort(t);
        System.out.print(t[c-1]*t[c-2]);
}
}