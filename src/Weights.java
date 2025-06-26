/*
You have some apples and a basket that can carry up to 5000 units of weight.
Given an integer array weight where weight[i] is the weight of the ith apple,
return the maximum number of apples you can put in the basket.

Sample Testcase:1
----------------------------------
input=4
100 200 150 1000
output=4
Explanation:
-------------------------------------
All 4 apples can be carried by the basket since their
sum of weights is 1450.


 */
import java.util.*;
class Weights{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0,sum=0;
        for(int i=0;i<n;i++){
            sum += a[i];
            count++;
            if(sum>5000){
                count--;
                break;
            }
        }
        System.out.println(count);
    }
}