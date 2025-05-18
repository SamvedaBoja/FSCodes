/*

Given two strings s and p, return an array of all the start indices of p's anagrams in s.
You return the answer in sorted order.

Sample Testcase:1
------------------------------------
input=cbaebabacd abc
output=[0,6]

Explanation:
-------------------------------------
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

 */
/*
import java.util.*;
class Indexes{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //String s[]=sc.nextLine().split(" ");
        /*
        String s=sc.next();
        char s1[]=s.toCharArray();
        String p=sc.next();
        char p1[]=p.toCharArray();
        int wlen=p.length();
        ArrayList<Integer> list = new ArrayList<>();
        int l=0,r=p1.length-1;
        while(r<=s1.length){
            for(int i=0;i<wlen;i++){
                Arrays.sort(s1);
                Arrays.sort(p1);
                if(s1.equals(p1)){
                    list.add(i);
                }
                l++;
                r++;
            }
        }
        System.out.print(list);

         */
/*
        String s=sc.next();
        String p=sc.next();
        ArrayList<Integer> list = new ArrayList<>();
        int pCount[]=new int[26];
        int sCount[]=new int[26];
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        int pLen = p.length();

        // Initialize the first window
        for (int i = 0; i < pLen; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        // Check if the first window is an anagram
        if (Arrays.equals(pCount, sCount)) {
            list.add(0);
        }

        // Sliding window across the string
        for (int i = pLen; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++; // Add new character
            sCount[s.charAt(i - pLen) - 'a']--; // Remove leftmost character

            if (Arrays.equals(pCount, sCount)) {
                list.add(i - pLen + 1);
            }
        }
        System.out.println(list);
    }
}
*/
import java.util.*;
class Indexes{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        List<Integer> list = new ArrayList<>();
        if(s.length()<p.length()){
            System.out.println(list);
            return;
        }
        int pCount[] = new int[26];
        int sCount[] = new int[26];
        for(int i=0;i<p.length();i++){
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(sCount,pCount)){
            list.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i-p.length()) - 'a']--;
            if(Arrays.equals(sCount,pCount)){
                list.add(i-p.length()+1);
            }
        }
        System.out.println(list);
    }
}
