/*
Given an 2D character array, Letters[][], of size r*c.
You have to construct the word W, using the given array.

Rules to construct the word are as follows:
	- All the letters of the word W, should be adjacent to each other
	in the array Letters(either horizontal or vertical).
	- You can use each charcater in Letters[][] only once.

If you are able to construct the word W, return 'true'
Otherwise 'false'.

Input Format:
-------------
Line-1 -> two integers R and C, array size.
R lines -> C space separated characters.
Last line -> a string, word W

Output Format:
--------------
print the boolean resulta b c.


Sample Input-1:
---------------
3 3
a b c
d e f
g h i
bad

Sample Output-1:
----------------
true

Sample Input-2:
---------------
3 3
a b c
d e f
g h i
ace

Sample Output-2:
----------------
false


Sample Input-3:
---------------
3 3
a b c
d e f
g h i
add

Sample Output-3:
----------------
false

 */

import java.util.*;
class WordCheck{
    static int r;
    static int c;
    static char a[][];
    static boolean visited[][];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        a=new char[r][c];
        visited=new boolean[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
        String word = sc.next();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j] == word.charAt(0)){
                    if(wordcheck(i,j,0,word)){
                        System.out.println("true");
                        return;
                    }
                }
            }
        }
        System.out.println("false");
    }
    public static boolean wordcheck(int i,int j,int index,String word){

        if(index == word.length()){
            return true;
        }
        if(i<0 || i>=r || j<0 || j>=c || visited[i][j] || a[i][j] != word.charAt(index)){
            return false;
        }
        visited[i][j]= true;

        boolean result = wordcheck(i+1,j,index+1,word) ||  wordcheck(i-1,j,index+1,word) || wordcheck(i,j+1,index+1,word) || wordcheck(i,j-1,index+1,word);
        visited[i][j]= false;
        return result;
    }
}