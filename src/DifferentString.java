
/*
You are given an array words consisting of strings. Each string in words has the same length n.
Each string can be converted into a difference array of length n - 1. The difference array is
 calculated using the positions of characters in the English alphabet (where 'a' = 0, 'b' = 1, ..., 'z' = 25).

For a string s, its difference array diff is defined as:
diff[i] = position(s[i+1]) - position(s[i])   for i = 0 to n - 2

All strings in the array words have the same difference array except one.
Your task is to find and return the string with the unique difference array.

Sample Testcase:1
-----------------------------------
input=adc,wzy,abc
output=abc

Explanation:
--------------------------------
- The difference integer array of "adc" is [3 - 0, 2 - 3] = [3, -1].
- The difference integer array of "wzy" is [25 - 22, 24 - 25]= [3, -1].
- The difference integer array of "abc" is [1 - 0, 2 - 1] = [1, 1].
The odd array out is [1, 1], so we return the corresponding string, "abc".
 */
import java.util.*;
class DifferentString{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str[]=sc.next().split(",");
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s: str){
            List<Integer> al = new ArrayList<>();
            int n=s.length();
            for(int i=0;i<n-1;i++){
                al.add( s.charAt(i+1) - s.charAt(i));
            }
            String diff = al.toString();
            hm.putIfAbsent(diff,new ArrayList<>());
            hm.get(diff).add(s);
        }
        for(Map.Entry<String,List<String>> entry: hm.entrySet()){
            if(entry.getValue().size() == 1){
                System.out.println(entry.getValue().get(0));
                break;
            }
        }
    }
}