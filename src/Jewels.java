import java.util.*;
public class Jewels {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        char jewels[]=str[0].toCharArray();      //aA
        char stones[]=str[1].toCharArray();      //aAAbbbb
        int count=0;                             //output = 3
        for(int i=0;i<jewels.length;i++){
            for(int j=i;j<stones.length;j++) {
                if (jewels[i] == stones[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
