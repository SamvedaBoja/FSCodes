//Program to check if a sentence contains all the letters in english alphabet
import java.util.*;
public class Sentence {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
            else{
                continue;
            }
        }
        if(hs.size()==26){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
