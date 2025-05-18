/*
1 You are given an integer array height of length n. There are n vertical
lines drawn such that the two endpoints of the i-th line are at (i, 0) and (i, height[i]).
Find two lines that, together with the x-axis, form a container such that the container holds the most water.
Return the maximum amount of water a container can store.

Note: You may not slant the container.

Sample Testcase:1
------------------------
input=1 8 6 2 5 4 8 3 7
output=49


 */
import java.util.*;
class Container{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int l=0,r=a.length-1;
        int area=0,min=0;
        while(l<r){
            min=Math.min(a[l],a[r])*(r-l);
            area=Math.max(area,min);
            if(a[l]<a[r]){
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println(area);

    }
}
