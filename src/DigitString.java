/*
Number of Different Integers in a String
You are given a string word that consists of digits and lowercase English letters.

You will replace every non-digit character with a space. For example,
"a123bc34d8ef34" will become " 123  34 8  34".
Notice that you are left with some integers that are separated by at least one
space: "123", "34", "8", and "34".

Return the number of different integers after performing the replacement operations
on word.

Two integers are considered different if their decimal representations without any
leading zeros are different.

Sample Testcase:1
------------------------------
n123gi34t8km34
output=3
Explanation: The three different integers are "123", "34", and "8". Notice that
"34" is only counted once.


Sample Testcase:2a1
------------------------------
x1y01z001
output=1
Explanation: The three integers "1", "01", and "001" all represent the same integer because
the leading zeros are ignored when comparing their decimal values.

 */
import java.util.*;
class DigitString{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else{
                sb.append(" ");
            }
        }
        int count=0;
        String str=sb.toString();
        String a[]=str.split(" ");
        HashSet<String> hs = new HashSet<>();
        for(String n:a){
            //String sm = a[i].replaceFirst("^0+", """);
            //if(s.isEmpty())
            //s=0
            if(!n.isEmpty()){
                String remove= new java.math.BigInteger(n).toString();
                hs.add(remove);
            }
        }
        System.out.println(hs.size());
    }
}