/*
There are n gas stations along a circular route, where the amount of gas at
the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel
from the ith station to its next (i + 1)th station. You begin the journey with an
empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index
if you can travel around the circuit once in the clockwise direction, otherwise
return -1. If there exists a solution, it is guaranteed to be unique.

Sample Testcase:1
-------------------------
input=5
1 2 3 4 5
3 4 5 1 2
output=3
Explanation:
-------------------------
Start at station 3 (index 3) and fill up with 4 unit of gas.
Your tank = 0 + 4 = 4
Travel to station 4. Your tank = 4 - 1 + 5 = 8
Travel to station 0. Your tank = 8 - 2 + 1 = 7
Travel to station 1. Your tank = 7 - 3 + 2 = 6
Travel to station 2. Your tank = 6 - 4 + 3 = 5
Travel to station 3. The cost is 5. Your gas is just enough to travel back
to station 3.
Therefore, return 3 as the starting index.

 */
import java.util.*;
public class GasStations{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []gas = new int[n];
        for(int i=0;i<n;i++){
            gas[i]=sc.nextInt();
        }
        int cost[] =new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        int totalGas=0,totalCost=0;
        int start=0,tank=0;
        for(int i=0;i<n;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
            tank+=gas[i]-cost[i];
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        if(totalGas<totalCost){
            System.out.println("-1");
        }
        else{
            System.out.println(start);
        }
    }
}