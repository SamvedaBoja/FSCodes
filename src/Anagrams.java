/*
Given an array of strings, group anagrams together.

Sample Testcase:1
--------------------------------------------
input =god dog ogd abc aaa cba
output =[[god, dog, ogd],[abc, cba],[aaa]]


 */

import java.util.*;
class Anagrams{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        Map<String,List<String>> hm = new HashMap<>();
        for(String s:str){
            char a[]=s.toCharArray();
            Arrays.sort(a);
            String element=new String(a);
            if(!hm.containsKey(element)){
                hm.put(element,new ArrayList<>());
            }
            hm.get(element).add(s);
        }
        List<List<String>> l = new ArrayList<>(hm.values());
        System.out.println(l);
    }
}