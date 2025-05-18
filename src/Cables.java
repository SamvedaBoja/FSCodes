
/*
A telecom company is laying down fiber optic cables to connect multiple locations.
 Each cable has a different length and cost of connecting two cables is equal to the
 sum of their lengths (due to the welding and insulation process required at the joint).
 The company wants to connect all cables into a single long cable with the minimum total welding cost.

Your task is to takes the lengths of the cables and returns the minimum cost to connect all of them.

Input Format:
---------------------------
First line: Integer n – the number of cables.
Second line: n integers – the lengths of the cables.

Output Format:
---------------------------
A single integer – the minimum total cost to connect all cables.

Sample Testcase:1
-----------------------
input=4
4 3 2 6
output=29

Explanation:
------------------------------
2+3=5, 4+5=9, 9+6=15 → 5+9+15 = 29


 */
import java.util.*;
class Cables{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int res = 0;
        while(l.size()>1){
            Collections.sort(l);
            int x =l.get(0);
            int y= l.get(1);
            int sum = x+y;
            res += sum;
            l.remove(1);
            l.remove(0);
            l.add(sum);
        }
        System.out.println(res);

    }
}