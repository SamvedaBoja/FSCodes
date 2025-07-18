/*
There are N Empty glasses with a capacity of 1,2....N Litres(there is exactly
one glass of each unique capacity).
You want to pour exactly K litres of water into glasses.
Each glass may be either full or empty (a glass cannot be partially filled).
What is the minimum number of glasses that you need to conatin K litres
of water?

write a function

class Solution{
public int solution(int N,int K)
{

}
}

that given two integers, N and K return the minimum number of glasses that are
needed to contain exactly K litres of water.
If it is not possible to pour exactly K litres of water into glasses then the
function should return -1

Given N = 5, K=8, the function should return 2.
There are five glasses of capacity 1,2,3,4 and 5.
You can use two glasses with capacity 3 and 5 to hold 8 litres of water.

Given N=4 and K=10, the function should return 4.
You must use all the glasses to contain 10 litres of water.

Given N=1 and K=2, the function should return -1.
There is only one glass with capacity 1, so you cannot pour 2 litres of water.

Write an efficient alogirthm for the following assumptions

N is an integer within the range [1...1,000,000];
K is an integer within the range [1..1,000,000,000];

Sample Testcase:1
---------------------------------------
input=5 8
output=2

 */
import java.util.*;
public class RealPage1 {
    public static int solution(int n,int k){
        int count=0;
        for(int i=n;i>=1 && k>0;i--){
            if(i <= k){
                k -= i;
                count++;
            }
        }
        if(k==0)
        return count;
        else
            return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int result = solution(n,k);
        System.out.println(result);
    }
}
