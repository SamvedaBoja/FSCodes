/*
Print nth prime number

Sample Testcase:1
---------------------------
input=3
output=5

 */
import java.util.Scanner;
public class Prime{
    // Function to check if a number is prime
    static boolean isPrime(int num){
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }
    // Function to find the nth prime number
    static int findNthPrime(int n){
        int count = 0;
        int num = 1;
        while (count < n){
            num++;
            if (isPrime(num)){
                count++;
            }
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nthPrime = findNthPrime(n);
        System.out.println(nthPrime);
    }
}