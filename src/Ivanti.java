/*
Given a string, find the first non-repeating character in it and return
its index. If it doesn’t exist, return -1.
Example questions:
Consider a string where all characters are lowercase alphabets.

sample Testcase:1
--------------------------------
input=helloworld
output=0

Explanation:
--------------------------------
In the string ‘helloworld’, the first non-repeating character is ‘h’, which
is at index 0.

 */

    import java.util.*;
    class Ivanti{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=sc.next().toLowerCase();
            HashMap<Character,Integer> hm = new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            int flag=0;
            for(int i=0;i<s.length();i++){
                if(hm.get(s.charAt(i)) == 1){
                    System.out.print(i);
                    return;
                }
                else
                    flag=1;
            }
            if(flag == 1)
                System.out.println("-1");
        }
    }

