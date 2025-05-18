
/*
A version Managementsystem (VMS) is a repository of files, often the files
 for the source code of computer programs, with monitored access. Every
 change made to the source is tracked, along with who made the change,
why they made it, and references to problems fixed, or enhancements
introduced, by the change.

In this problem we will consider a simplified model of a development project.
Let's suppose that there are N source files in the project. All the source files
are distinct and numbered from 1 to N.
A VMS which is used for maintaining the project contains two sequences of source files.
 The first sequence contains M source files that are ignored by the VMS. If a source
 file is not in the first sequence, then it's considered to be unignored.
The second sequence contains K source files that are tracked by the VMS.
If a source file is not in the second sequence, then it's considered to be untracked.

A source file can either be or not be in any of these two sequences.
Your task is to calculate two values: the number of source files of
 the project, that are both tracked and ignored, and the number of
source files of the project, that are both untracked and unignored.

Input Format:
-------------------
The first line of the input contains three integers N, M and K
denoting the number of source files in the project, the number
 of ignored source files and the number of tracked source files.
 Assume that the maximum value for N as 50.
The second line contains M distinct integers denoting the sequence A
of ignored source files. The sequence is strictly increasing.
The third line contains K distinct integers denoting the sequence B
 of tracked source files. The sequence is strictly increasing.

Output Format:
-------------------
Output a single line containing two integers: the number of the
source files, that are both tracked and ignored, and the number
of the source files, that are both untracked and unignored.
Refer sample input and output for formatting specifications.

Sample Testcase:1
--------------------
input=7 4 6
1 4 6 7
1 2 3 4 6 7
output=4 1

Sample Testcase:2
--------------------
4 2 2
1 4
3 4
output=1 1


 */
import java.util.*;
class Sub1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String in[]=sc.nextLine().split(" ");
        int n=Integer.parseInt(in[0]);
        int m=Integer.parseInt(in[1]);
        int k=Integer.parseInt(in[2]);
        Set<Integer>ig=new HashSet<Integer>();
        Set<Integer>tr=new HashSet<Integer>();
        in=sc.nextLine().split(" ");
        for(String s:in){
            ig.add(Integer.parseInt(s));
        }
        in=sc.nextLine().split(" ");
        for(String s:in){
            tr.add(Integer.parseInt(s));
        }
        int b=0;
        for(Integer i:ig){
            if(tr.contains(i)){
                b++;
            }
        }
        int d=n-(ig.size()+tr.size()-b);
        System.out.println(b+" "+d);
    }
}
