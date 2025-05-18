/*

You're developing a text analysis tool for language processing.
 One of the functionalities required is to convert sentences into a
 format where vowels are represented by 'V' and consonants by 'C', maintaining
an alternating sequence. This format aids in certain linguistic analyses and data processing tasks.

It is not permissible to have two or more consecutive V or C in Sequence.


Sample Testcase:1
-------------------------------
input =Whereabouts
output =CVCVCVC

Sample Testcase:2
-------------------------------
input =make in india
Output=CVCVCVCV
*/
import java.util.*;
public class Vowels{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String v = "aeiouAEIOU";
        s.replace(" ","");
        StringBuilder res = new StringBuilder();
        char c = ' ';

        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                char l = v.indexOf(ch)!= -1?'V':'C';

                if(res.length()==0||l!=c){
                    res.append(l);
                    c=l;
                }
            }
        }
        System.out.println(res.toString());
    }
}
