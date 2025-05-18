
/*
You are working as a software engineer in a security system company.
Your team is developing an anomaly detection system that monitors login
 attempts from different user IDs. Due to repeated hacking attempts,
 most user IDs appear multiple times in the system logs. However, you
need to identify the first user ID that attempted login only once to
 investigate potential legitimate access.

Your task is to processes an array of user IDs and returns
 first non-repeating user ID. If no such ID exists, return -1.

Sample Testcase:1
----------------------------------
input=4 5 1 2 0 4 5 1 2
output=0
*/
import java.util.*;
public class Hashmap{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[] = new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        int cnt=0;
        for(int key:hm.keySet()){
            if(hm.get(key)==1){
                System.out.print(key+" ");
                cnt++;
                break;
            }
        }
        if(cnt==0){
            System.out.print("-1");
        }
    }
}

