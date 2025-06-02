/*
A university is forming a committee of r members from a pool of n student volunteers.
 The goal is to explore all possible unique combinations of size r from the list of
 students, so that the event coordinator can choose the most suitable team based on
different criteria (e.g., skill set, availability, diversity).

Write a program to generate all combinations of size r using backtracking

Input Format:
-------------------
Line:1-N number of array elements
Line:2- Array elements
Line:3- Size of combination

Sample Testcase:1
-----------------------------------
input=5
1 2 3 4 5
3
output=
[1, 2, 3]
[1, 2, 4]
[1, 2, 5]
[1, 3, 4]
[1, 3, 5]
[1, 4, 5]
[2, 3, 4]
[2, 3, 5]
[2, 4, 5]
[3, 4, 5]



 */
import java.util.*;
class BackTrack1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int size=sc.nextInt();
        List<Integer> l = new ArrayList<>();
        backtrack(a,size,l,0);
    }
    public static void backtrack(int a[],int size,List<Integer> l,int index){
        if(l.size() == size){
            System.out.println(l);
            return;
        }
        for(int i=index;i<a.length;i++){
            l.add(a[i]);
            backtrack(a,size,l,i+1);
            l.remove(l.size()-1);
        }
    }
}
/*
import java.util.*;
class test
{
    public static void Comb(int[] arr, int r)
    {
        List<Integer> al = new ArrayList<>();
        backtrack(arr, r, 0, al);
    }
    private static void backtrack(int[] arr, int r, int start, List<Integer> al)
    {
        if (al.size() == r)
        {
            System.out.println(al);
            return;
        }
        for (int i = start; i < arr.length; i++)
        {
            al.add(arr[i]);
            backtrack(arr, r, i + 1, al);
            al.remove(al.size()- 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        Comb(arr,r);

    }
}
 */