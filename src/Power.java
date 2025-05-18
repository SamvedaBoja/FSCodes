
/*
A data center wants to allocate memory storage in such a way that it can efficiently
scale up or down based on demand. The storage units available are always in powers
of two (1GB, 2GB, 4GB, 8GB, etc.).

To ensure that a given storage request is valid, the system needs a program that
checks  whether the requested storage size is a power of two.

Write a Java program that takes an integer representing the storage size and returns true
        if it is a valid storage size (a power of two) and false otherwise.

Sample Testcase:1
        ---------------------------
input=1
output=true

Explanation:
        -----------------
        2^0 = 1

 */
/*
import java.util.*;
class Power{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(n==Math.pow(2,i)){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
*/

import java.util.*;
class Power{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(power(n));
    }
    public static boolean power(int n){
        if(n/2 == 0)
            return true;
        if(n%2 != 0)
            return false;
        return power(n/2);
    }
}