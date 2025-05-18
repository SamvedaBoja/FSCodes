/*
You are given a string s. You need to partition the string into
as many parts as possible so that each letter appears in at most one part.

Return a list of integers representing the size of these parts.

Sample Testcase:1
------------------------
input=ababcbacadefegdehijhklij
output=[9,7,8]


 */

import java.util.*;
class Alphabet{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        List<Integer> res=new ArrayList<>();
        int a[]=new int[26];
        for(int i=0;i<str.length();i++){
            a[str.charAt(i)-'a']=i;
        }
        int s=0,e=0;
        for(int i=0;i<str.length();i++){
            e=Math.max(e,a[str.charAt(i)-'a']);
            if(i==e){
                res.add(e-s+1);
                s=i+1;
            }
        }
        System.out.println(res);
    }
}