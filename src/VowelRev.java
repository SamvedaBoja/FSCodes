
/*
Ms Saina is given a task.
  She needs your help to complete the task.

 The Task is defined as follows:
      - She is given a word W.
      - She needs to find all the vowels in W from left to right.
        and arrange them from right to left in the word W.

 Your task is to modify the word W according to the above steps.
ANd print the resultant word.

NOTE:
- Vowels are [a,e,i,o,u].
- W contains only lowwercase letters.

 Input Format:
 -------------
 A string W, word.

 Output Format:
 --------------
 Print a string result.

Sample Input-1:
---------------
 divide

 Sample Output-1:
----------------
devidi

 Explanation:
 ------------
the order of vowels from left to right in W are : i, i, e
After arrange them from right to left order, the word is : devidi

Sample Input-2:
---------------
racing

Sample Output-2:
----------------
ricang

 */
import java.util.*;
class VowelRev {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        int l=0,r=c.length-1;
        while(l<r){
            while(l<r && (c[l]!='a' && c[l]!='e' && c[l]!='i' && c[l]!='o' && c[l]!='u')){
                l++;
            }
            while(l<r && (c[r]!='a' && c[r]!='e' && c[r]!='i' && c[r]!='o' && c[r]!='u')){
                r--;
            }
            if(l<r){
                char temp;
                temp=c[l];
                c[l]=c[r];
                c[r]=temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }

    }
}