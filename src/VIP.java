/*
Imagine you are at a large conference with n attendees numbered from 0 to n-1.
Among them, there might be a VIP guest — a celebrity who:
Everyone else at the conference knows (they recognize or have heard of the VIP).
The VIP does not know any of the other attendees (they keep a low profile and don’t recognize others).
Your goal is to find out who the VIP guest is, or determine that there isn’t one.

How you can find the VIP:
You can only ask one question at a time to an attendee:

"Hey, does person A know person B?"

Using as few such questions as possible, determine:
The VIP’s label if one exists.
Or return -1 if there is no VIP.

The input is an n x n matrix (2D grid), where n is the number of people.
The element at position [i][j] is either:
	1 if person i knows person j.
	0 if person i does NOT know person j.

Sample Testcase:1
-------------------------------
input=3
1 1 0
0 1 0
1 1 1
output=1

Explanation:
-----------------------------------

There are three persons labeled with 0, 1 and 2. graph[i][j] = 1
means person i knows person j, otherwise graph[i][j] = 0 means person i does
not know person j. The VIP is the person labeled as 1 because
both 0 and 2 know him but 1 does not know anybody.

 */
/*
import java.util.*;
class VIP{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int count=-1,res=0;
        boolean flag=false;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                l.add(mat[i][j]);
            }
                if(l.get(i)==0){
                   count--;
                }
                else
                    count++;
            if(count==1){
                res=i;
                flag=true;
            }
        }
        if(!flag)
            System.out.println(-1);
        else
            System.out.println(res);

    }
}
 */

import java.util.*;
class VIP{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int vip=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(mat[vip][i] == 1){
                vip=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i != vip){
                if(mat[vip][i] == 1 || mat[i][vip] == 0){
                    vip=-1;
                }
            }
        }
        System.out.println(vip);
    }
}
