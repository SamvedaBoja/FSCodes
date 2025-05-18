/*
Write a program to compute the frequency of each lowercase letter in the string.

Input Format:
--------------------

Input consists of a string. Assume that all characters in the string are
lowercase letters and the maximum length of the string is 200.

Output Format:
--------------------
The letters are displayed sorted in ascending order.


Sample Testcase:1
--------------------------
input=anitha
output=a 2
h 1
i 1
n 1
t 1
*/

import java.util.*;
class Order{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();

        TreeMap<Character,Integer> hm=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                int count=hm.get(c);
                count=count+1;
                hm.put(c,count);
            }
            else{
                hm.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }

    }
}
