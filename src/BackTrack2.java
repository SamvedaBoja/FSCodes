
/*

A manager is planning to form a small project team of r employees from a list of candidates.
Each candidate has an associated cost (e.g., based on hourly rate or required resources).
The total cost of the selected team must not exceed a predefined budget S.

The goal is to generate all possible teams of exactly r employees such that the total
cost of each team is strictly less than S.

Note: The candidate list (with their costs) is provided in sorted order

Input Format:
--------------------------------
Line:1- N value
Line:2- number of elements
Line:3- combination size
Line:4- maximum sum limit

Sample Testcase:1
--------------------------------
input=5
1 2 3 4 5
3
10
output=
[1, 2, 3]
[1, 2, 4]
[1, 2, 5]
[1, 3, 4]
[1, 3, 5]
[2, 3, 4]

 */
import java.util.*;
class BackTrack2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int size=sc.nextInt();
        int maxsum=sc.nextInt();
        List<Integer> l = new ArrayList<>();
        backtrack(a,size,l,0,maxsum);
    }
    public static void backtrack(int a[],int size,List<Integer> l,int index,int maxsum){
        if(l.size() == size){
            int sum=0;
            for(int i=0;i<size;i++){
                sum += l.get(i);
            }
            if(sum<maxsum)
                System.out.println(l);
            return;
        }
        for(int i=index;i<a.length;i++){
            l.add(a[i]);
            backtrack(a,size,l,i+1,maxsum);
            l.remove(l.size()-1);
        }
    }
}