/*
In an escape room game, you must form a secret message using letters from a
provided set of clues written on paper.
You can’t reuse letters once they’ve been used.
Determine if you can form the full message from the clues provided.

Sample Testcase:1
--------------------------------------
input=apple
appple
output=true



 */

import java.util.*;
public class Greedy16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = sc.nextLine();
        System.out.println(formMessage(s,str));
    }
    public static boolean formMessage(String s,String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }
}