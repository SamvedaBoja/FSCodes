/*
Given a positive integer num, return true if num is a perfect square
or false otherwise.
A perfect square is an integer that is the square of an integer.
In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.

case=1
input=16
output=true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 */
import java.util.*;
public class Root {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        long l=1,r=n;
        while(l<=r){
            long mid = l+(r-l)/2;
            long square = mid*mid;
            if(square == n){
                flag=true;
                break;
            }
            else if(square < n){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(!flag)
            System.out.println(flag);
        else
            System.out.println(true);
    }
}
