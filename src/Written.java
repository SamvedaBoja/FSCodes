/*
print the pattern
* * * * *
  * * * *
    * * *
      * *
        *
 */
/*
import java.util.*;
public class Written {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

 */
/*
print the pattern
a b c d e
  a b c d
    a b c
      a b
        a
 */
/*
import java.util.*;
class Written{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
      //  String str="abcde";
       // int n =str.length();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<n-i;k++){   //for(int k=i;k<n;k++)
                char ch=(char) ('a'+k);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

 */
import java.util.*;
class Written{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int denominations[]={2000,1000,500,200,100,50,20,10,5,2,1};
        List<Integer> l =new ArrayList<>();
        for(int i:denominations){
            if(amount >= i){
                l.add(i);
                int newamount=amount-i;
            }
        }
        System.out.println(l);
    }
}
/*
pattern
       #  #
     # #  # #
   # # #  # # #
 # # # #  # # # #
 */