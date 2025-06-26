/*
You are given an integer array arr. You can choose a set of integers and
remove all the occurrences of these integers in the array.

Return the minimum size of the set so that at least half of the integers of the
array are removed.

Sample Testcase:1
------------------------------
input=10
3 3 3 3 5 5 5 2 2 7
Output=2
Explanation:
-------------------------------
Choosing {3,7} will make the new array [5,5,5,2,2] which has
size 5 (i.e equal to half of the size of the old array).
Choosing set {2,7} is not possible as it will make the new array
[3,3,3,3,5,5,5] which has a size greater than half of the size of the old array.
 */
import java.util.*;
class Arrays{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:a){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int f:hm.values()){
            pq.add(f);
        }
        int cnt=0,del=0;
        if(n%2==0){
            while(del<n/2){
                del+=pq.poll();
                cnt++;
            }
        }
        else{
            while(del<(n/2)+1){
                del+=pq.poll();
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}