/*

A metal fabrication company has two different rods of varying lengths.
The company wants to cut both rods into the largest possible equal-sized
 pieces so that no metal is wasted.

Write a program that takes the lengths of two rods as input and calculates
 the maximum possible size of a single piece that can be used to cut both rods
 without any leftover metal.

Your program should determine and print the largest possible length of the equal pieces.

Sample Testcase:1
-----------------------
input=24 36
output=12

Explantion:
-------------------------------
Two rod lengths 24 and 36 maximum possible size of single piece is 12



 */

import java.util.*;
class GCD{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(gcd(m,n));
    }
    public static int gcd(int m,int n){
        if(n==0){
            return m;
        }
        else{
            return gcd(n,m%n);
        }
    }
}