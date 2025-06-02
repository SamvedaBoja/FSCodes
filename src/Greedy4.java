/*
At a lemonade stand, each lemonade costs $5. Customers are standing in a queue
to buy from you and order one at a time (in the order specified by bills).
Each customer will only buy one lemonade and pay with either a $5, $10,
or $20 bill. You must provide the correct change to each customer so that the
net transaction is that the customer pays $5.

Note that you do not have any change in hand at first.

Given an integer array bills where bills[i] is the bill the ith customer pays,
return true if you can provide every customer with the correct change,
or false otherwise.

Sample TestCase:1
--------------------------
input=5
5 5 5 10 20
output=true

Explanation:
-----------------------------
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.

 */
import java.util.*;
class Greedy4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bills[]=new int[n];
        for(int i=0;i<bills.length;i++){
            bills[i]=sc.nextInt();
        }
        int five=0,ten=0,twenty=0;
        boolean flag=false;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                ten++;
                if(five>=1){
                    five--;
                }
                else{
                    System.out.println(false);
                    return;
                }
            }
            else if(bills[i]==20){
                twenty++;
                if(five>=3){
                    five=five-3;
                }
                else if(five>=1 && ten>=1){
                    five--;
                    ten--;
                }
                else{
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
