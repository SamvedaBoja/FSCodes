/*
To maintain fairness and difficulty progression, the game
designer wants to adjust the points assigned to each level

so that:
    - All levels must have distinct rewards.
    - The total reward points should be minimized, ensuring that the reward
    for each level is at least as much as it was originally assigned.

Given N levels and an array of N integers representing the initial rewards for
each level, determine the minimum total reward points the game can assign after
making the necessary adjustments.

Input Format
------------
An integer N - representing the number of levels.
An array of N integers - representing the initial rewards.

Output Format
-------------
A single integer, representing the minimum total reward points after ensuring
that all levels have unique rewards.


Sample Input:
-------------
5
10 20 30 40 50

Sample Output:
--------------
150
 */
import java.util.*;
class Greedy9{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            while(l.contains(num)){
                num++;
            }
            l.add(num);
        }
        int sum=0;
        for(int i:l){
            sum += i;
        }
        System.out.println(sum);
    }
}