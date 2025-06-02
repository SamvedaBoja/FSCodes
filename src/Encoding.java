/*
Estar is an intelligent girl
She always send the information in endoded format.
For Example:
String S= "meetingatbarista"
and integer N = 4, is number of rows.

She encode the string S as follows:
m  g  i
e na rs
ei  ta t
t   b  a

Now to obtain encoded S,  append all the characters row-wise, "mgienarseitattba".

Please help Estar with a program, to enode the given string S, based N value.

Input Format:
-------------
Line-1 -> An integer N.
Line-2 -> A String S

Output Format:
--------------
Print the encoded S.


Sample Input-1:
---------------
4
meetingatbarista

Sample Output-1:
----------------
mgienarseitattba


Sample Input-2:
---------------
3
canwecatchupforsometime

Sample Output-2:
----------------
cecfoiawcthposmtmnauree
 */

import java.util.*;
class Encoding{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        String s = sc.next();
        int l=s.length();
        char mat[][]=new char[r][l];

        int currentrow = 0;
        boolean direction = true;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<l;i++){
            mat[currentrow][i]=s.charAt(i);

            if(currentrow == r-1)
                direction=false;
            else if(currentrow == 0)
                direction = true;

            currentrow += direction ? 1: -1;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<l;j++){
                if(mat[i][j] != 0){
                    sb.append(mat[i][j]);
                }
            }
        }
        System.out.print(sb.toString());
    }
}