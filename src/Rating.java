/*
LucarnosFilm Festival is an annual film festival and is also known for being a
 prestigious platform for art house films. This time at the Lucarnos Film festival
 there are N movies screened, each of different genre ranging from drama movies
 to comedy ones and teen movies to horror ones. Lucy is a huge fan of movies
and visited the film festival, but she's not sure which movie she should watch.

Each movie can be characterized by two integers Li and Ri, denoting the length
and the rating of the corresponding movie. Lucy wants to watch exactly one movie
 with the maximal value of Li × Ri. If there are several such movies,
she would pick a one with the maximal Ri among them. If there is still a tie,
she would pick the one with the minimal index among them.

Help Lucy pick a movie to watch at the film festival.

Input Format:
------------------------------
The first line of the input description contains an integer n. Assume that
the maximum value for n as 50.The second line of the input description
contains n integers L1, L2, ...,Ln.The following line contains n integers
R1, R2, ...,Rn.

Output Format:
----------------------------
Output a single integer i denoting the index of the movie that Lucy should
watch in the film festival. Note that you follow 1-based indexing.


Sample Testcase:1
----------------------
input=2
1 2
2 1
output=1

Sample Testcase:2
----------------------
input=4
2 1 4 1
2 4 1 4
output=2


 */
import java.util.*;
class Rating{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l[]=new int[n+1];
        int r[]=new int[n+1];
        for(int i=1;i<=n;i++){
            l[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            r[i]=sc.nextInt();
        }
        int max=0;
        int index=1;
        int res[]=new int[n+1];
        for(int i=1;i<=n;i++){
            res[i] = l[i] * r[i];
            if (res[i]> max){
                max = res[i];
                index = i;
            }
            else if(res[i] == max){
                if (r[i] > r[index]){
                    max = res[i];
                    index = i;
                }
            }
        }
        System.out.println(index);
    }

}
        /*
        int flag=0;
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length;j++){
                if(res[i]==res[j]){
                    flag=1;
                    break;
                }
                else{
                    flag=2;

                }
            }
        }
        if(flag==1){
            System.out.println(index);
        }
        if(flag==2){
            int max1=0;
            int index1=0;
            for(int i=0;i<res.length;i++){
                if(res[i]>max1)
                    max1=res[i];
                index1=i+1;
            }
            System.out.println(index1);
        }
        if(flag==0){
            int max2=0;
            int index2=0;
            for(int i=0;i<l.length;i++){
                if(l[i]>max2)
                    max2=l[i];
                index2=i+1;
            }
            System.out.println(index2);
        }
    }
}

         */