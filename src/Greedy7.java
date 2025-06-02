
/*
You are given an integer num. You can swap two digits at most once to get
the maximum valued number.
Return the maximum valued number you can get.

Sample Testcase:1
--------------------------
input=2736
output=7236
Explanation: Swap the number 2 and the number 7.

 */
import java.util.*;
class Greedy7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char []a= s.toCharArray();
        int max=0;
        int index=-1;
        for(int i=0;i<s.length();i++){
            if(a[i] - '0' > max){
                max=a[i]-'0';
                index=i;
            }
        }
        char temp=a[0];
        a[0]=a[index];
        a[index]=temp;
        for(int i=0;i<s.length();i++){
            System.out.print(a[i]+"");
        }
    }
}
