/*
In a town, there are n people labeled from 1 to n. There is a rumor that one of
these people is secretly the town judge.

If the town judge exists, then:
1.	The town judge trusts nobody.
2.	Everybody (except for the town judge) trusts the town judge.
3.	There is exactly one person that satisfies properties 1 and 2.

You are given an array trust where trust[i] = [ai, bi] representing that the
person labeled ai trusts the person labeled bi. If a trust relationship does
not exist in trust array, then such a trust relationship does not exist.

Return the label of the town judge if the town judge exists and can be
identified, or return -1 otherwise.

case=1
input=2 1
1 2
output=2

case=2
input=3 2
1 3
2 3
output=3
 */
import java.util.*;
public class Judge{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int trust[][]=new int[t][2];
        for(int i=0;i<t;i++){
            trust[i][0]=sc.nextInt();
            trust[i][1]=sc.nextInt();
        }
        int res[]=new int[n+1];
        for(int pair[]:trust){
            res[pair[0]]--;
            res[pair[1]]++;
        }
        boolean flag=false;
        int judge=0;
        for(int i=1;i<=n;i++){
            if(res[i]==n-1)
                judge=i;
               flag=true;
        }
        if(!flag)
            System.out.println(-1);
        else
            System.out.println(judge);
    }
}
/*
	•	If person x trusts someone → they cannot be the judge.
	•	If person x is trusted by n - 1 people (everyone except themselves) → they might be the judge.
	•	The person who satisfies both is the judge.
 */