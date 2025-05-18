
/*
You are developing a real-time chat application. One of the features
is to detect the longest sequence of unique words typed by a user in
a single message. The goal is to help users avoid repeating words while
forming meaningful sentences.

Given a message (a string of words separated by spaces),
find the length of the longest substring that contains only
unique words without repetition.

Sample Testcase:1
-----------------------------------------
input=abcabcbb
output=3

 */
/*
import java.util.*;
class MaxSubstring{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        List<Character> l=new ArrayList<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!l.contains(ch)){
                l.add(ch);
                count++;
            }
            else{
                l.clear();
                count=0;
                l.add(ch);
                count++;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
    }
}
*/
import java.util.*;
class MaxSubstring{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> h =new HashSet<>();
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(h.contains(c)){
                h.remove(s.charAt(l));
                l++;
            }
            h.add(c);
            max=Math.max(max,i-l+1);
        }
        System.out.println(max);
    }
}