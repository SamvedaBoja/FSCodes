
/*

You are given a Type-II address string. A valid Type-II address must meet the
following conditions:

It contains exactly 8 parts, each called a hextet.
Each hextet is separated by a colon : character.
Each hextet must:
Contain 1 to 4 characters.
Contain only hexadecimal characters (0-9, a-f, A-F).
Write a program that reads a Type-II address string and prints:
"Valid" if all the conditions are satisfied.
"Invalid" otherwise.

Sample Testcase:1
---------------------------------
input=abcd:ef12:3456:7:dce8:fab9:1:0cda
output=Valid


 */
import java.util.*;
class ValidIP{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.next().split(":");
        boolean flag=true;
        if(s.length != 8){
            flag=false;
        }
        else{
            for(String str: s){
                if(str.length() > 4){
                    flag=false;
                    break;
                }
                for(int i=0;i<str.length();i++){
                    char ch = str.charAt(i);
                    if(Character.digit(ch, 16) == -1){
                        flag = false;
                        break;
                    }
                }
                if(flag == false)
                    break;
            }
        }
        if(flag){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
