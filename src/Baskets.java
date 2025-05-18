/*
You are given an integer array fruits where fruits[i] represents the type of fruit in the i-th tree.
You have two baskets, and each basket can only hold a single type of fruit.
 You want to pick as many fruits as possible while following these rules:
You must pick exactly one fruit from each tree while moving from left to right.
Once you start picking from a tree, you must continue to move right.
You can carry at most two different types of fruits in your baskets at any time.
Return the maximum number of fruits you can collect in one go.


Sample Testcase:1
-----------------------------
input=1 2 1
output=3

Explanation:
----------------
We can pick all 3 fruits because we only need two baskets for fruit types 1 and 2.
 */
import java.util.*;
class Baskets{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int max=0;
        for(int i=0;i<a.length;i++){
            HashMap<Integer,Integer> hm = new HashMap<>();
            int c=0;
            for(int j=i;j<a.length;j++) {
                hm.put(a[j], hm.getOrDefault(a[j], 0) + 1);
                if (hm.size() > 2)
                    break;
                c++;
            }
            max=Math.max(max,c);
        }
        System.out.println(max);
    }
}
        /*
        int count=1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!hm.contains(a[i])){
                hm.add(a[i],count);
            }
            else{
                hm.add(a[i],count++);
            }
        }
        int max1=0,max2=0;
        int i=0;
        while(i<hm.size()){
            max1 = Math.max(hm.getValue(a[i]),hm.getValue(a[i+1]);
            i++;
        }
        hm.remove(hm.getKey(max1));
        int j=0;
        while(j<hm.size()){
            max2 = Math.max(hm.getValue(a[j]),hm.getValue(a[j+1]);
            j++;
        }
        hm.remove(hm.getKey(max2));
        System.out.println(max1+max2);
         */
