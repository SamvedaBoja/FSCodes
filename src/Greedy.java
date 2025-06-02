/*
You are given an array nums[], where each element in the array represents the maximum jump distance the robotic vacuum cleaner can make from that room. Initially, the vacuum cleaner is in the first room (index 0), and the goal is to determine whether the vacuum cleaner can reach the last room in the house.

At each room, the vacuum cleaner can either:

Stay in the current room (i.e., not move at all), or

Move forward to any of the next rooms, up to the maximum number of rooms
allowed by the jump distance in the current room.

You are asked to write a function that determines whether the robotic
vacuum cleaner can make it to the last room (index n-1) from the first
room (index 0) based on the jump distances provided in the nums array.

Sample Testcase:1
--------------------
input=2 3 1 1 4
output=true

Explanation:
----------------
Jump 1 step from index 0 to 1, then 3 steps to the last index.


 */
//2 3 1 1 4 = true
//2 3 1 0 0 0 4 =false
import java.util.*;
class Greedy{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        System.out.println(steps(a));
    }
    public static boolean steps(int a[]){
        int m=0;
        for(int i=0;i<a.length;i++){
            if(i>m){
                return false;
            }
            m = Math.max(m,i+a[i]);
        }
        return true;
    }
}