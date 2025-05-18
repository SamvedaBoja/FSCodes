
/*

Govind is playing with strings.
He is given two strings S1 and S2, He has to find if each character in S1 can S2 a word in S2 or not.

 A S2 that is both one-to-one (an injection) and onto (a surjection),
 i.e. a function which relates each letter in string S1 to a separate and distinct non-empty word in S2,
 where each non-empty word in S2 also has a corresponding letter in S1.

 Return true,if it is a complete S2.
 Otherwise false.

 Note: You may assume S1 and S2 contains only lowercase letters, S2 contains whitespace also.

 Input Format:
-------------
Line-1 -> A string S1, single word
Line-2 -> A string S2, group of space separated words.

Output Format:
--------------
Print a boolean value.

Sample Input-1:
---------------
baba
cat rat cat rat

Sample Output-1:
----------------
true

Sample Input-2:
---------------
baba
cat rat rat cat

Sample Output-2:
----------------
false
 */
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2[] = sc.nextLine().split(" ");

        HashMap<Character,String> hm = new HashMap<>();
        if(s1.length() != s2.length){
            System.out.println("false");
            return;
        }

        for(int i=0;i<s1.length();i++){
            if(hm.containsKey(s1.charAt(i))){
                if(!hm.get(s1.charAt(i)).equals(s2[i])){
                    System.out.println("false");
                    return;
                }
            }
            else{
                if(hm.containsValue(s2[i])){
                    System.out.println("false");
                    return;
                }
                hm.put(s1.charAt(i),s2[i]);
            }

        }
        System.out.println("true");
    }
}