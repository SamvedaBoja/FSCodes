
/*
You are helping a teacher who is organizing a class quiz. The teacher
gives you a list of student IDs who participated in the quiz. Some
students may have participated more than once, and the teacher wants
to know which students took the quiz exactly twice. Your task is to
print out the IDs of the students who participated exactly twice,
in the order they first appear in the list. If no student participated
        exactly twice, you should print a message saying "No students participated exactly twice."

Determine which students participated exactly twice. If there are
no such students, print the message "No students participated exactly twice."

Input Format:
        ----------------------------
The first input will be an integer n representing the number of student IDs in the list.
The second input will be n space-separated integers representing the student IDs.

Output Format:
        ----------------------------
If any student IDs appear exactly twice, print each of those IDs in the order
of their first appearance.
If no student participated exactly twice, output the message:
        "No students participated exactly twice."

Sample Testcase:1
        ----------------------------
input=5
        100 101 102 103 104
output=No students participated exactly twice

Sample Testcase:2
        ----------------------------
input=6
        101 102 103 101 104 102
output=101 102
*/

import java.util.*;
class Repeat{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int key:hm.keySet()){
            if(hm.get(key)==2){
                System.out.print(key+" ");
            }
            else{
                System.out.println("No students participated exactly twice");
            }
        }
    }
}

