
/*
Program to check whether number is happy number or not

Sample Testcase:1
---------------------
input=7
output=true


 */
import java.util.*;
class HappyNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        HashSet<Integer> hs = new HashSet<>();
        while(n!=1 && !hs.contains(n)){
            hs.add(n);
            int sum=0;
            while(n>0){
                a=n%10;
                sum += (a*a);
                n=n/10;
            }
            n=sum;
            }
       if(n==1){
          System.out.println("true");
       }
       else{
           System.out.println("false");
       }
    }
}
