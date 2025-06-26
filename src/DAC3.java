/*
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String num = Integer.toBinaryString(n);
        int res=DAC(num,0,num.length()-1);
        System.out.println(res);
    }
    public static int DAC(String num,int l,int r){
        if(l==r){
            if(num.charAt(l)=='1')
                return 1;
            else
                return 0;
        }
        int mid=l+(r-l)/2;
        int left = DAC(num,l,mid);
        int right = DAC(num,mid+1,r);
        return left+right;
    }
}
 */

import java.util.*;
class DAC3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String num = Integer.toBinaryString(n);
        int res=DAC(num,0,num.length()-1);
        System.out.println(res);
    }
    public static int DAC(String num,int l,int r){
        if(l==r){
            if(num.charAt(l)=='1')
                return 1;
            else
                return 0;
        }
        int mid=l+(r-l)/2;
        int left = DAC(num,l,mid);
        int right = DAC(num,mid+1,r);
        return left+right;
    }
}