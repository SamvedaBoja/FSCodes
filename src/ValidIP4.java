/*
A valid IP address consists of exactly four integers separated by single dots.
Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.

For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses,
but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
Given a string s containing only digits, return all possible valid IP addresses
that can be formed by inserting dots into s. You are not allowed to reorder or
remove any digits in s. You may return the valid IP addresses in any order.

Sample Testcase:1
----------------------------------------
input=25525511135
output=[255.255.11.135, 255.255.111.35]
 */

import java.util.*;
public class ValidIP4 {

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, int start, List<String> current, List<String> result) {
        // If 4 parts are collected and we've consumed the full string
        if (current.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }

        // Try to take 1 to 3 digits
        for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
            String part = s.substring(start, start + len);

            // Skip if part has leading zeros or is > 255
            if ((part.startsWith("0") && part.length() > 1) || Integer.parseInt(part) > 255) {
                continue;
            }

            current.add(part);
            backtrack(s, start + len, current, result);
            current.remove(current.size() - 1); // backtrack
        }
    }

    // Sample test
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.next();
        List<String> ips = restoreIpAddresses(input);
        System.out.println(ips);
    }
}

/*
Given a m x n grid filled with non-negative numbers, find a path from
top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Sample Testcase:1
-------------------------------
input=3 3
1 3 1
1 5 1
4 2 1
output=7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum
import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)continue;
                else if(i==0) a[i][j]+=a[i][j-1];
                else if(j==0)a[i][j]+=a[i-1][j];
                else a[i][j]+=Math.min(a[i-1][j],a[i][j-1]);
            }
        }
        System.out.println(a[m-1][n-1]);
    }
}
 */

/*
iven two integers n and k, return all possible combinations of k numbers
chosen from the range [1, n].


Sample Testcase:1
-------------------------------
input=4 2
output=[[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
Explanation: There are 4 choose 2 = 6 total combinations.

Note that combinations are unordered, i.e., [1,2] and [2,1] are considered
to be the same combination.
/*
public static void sortListOfList(List<List<Integer>> Subsets)
{
    Collections.sort(Subsets, (a, b) ->
    {
        int sizeA = a.size();
        int sizeB = b.size();

        // Compare element by element
        for (int i = 0; i < Math.min(sizeA, sizeB); i++)
        {
            if (!a.get(i).equals(b.get(i)))
            {
                return a.get(i) - b.get(i);
            }
        }

        // If all elements are equal, compare by size
        return sizeA - sizeB;
    });
}

import java.util.*;
class Solution
{
    public static void solve(List<List<Integer>>res,List<Integer>l,int n,int k,int start)
    {
        if(l.size()==k)
        {
            res.add(new ArrayList(l));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            l.add(i);
            solve(res,l,n,k,i+1);
            l.remove(l.size()-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<List<Integer>> res=new ArrayList<>();
        solve(res,new ArrayList<>(),n,k,1);
        System.out.println(res);
    }
}
 */

/*
A valid IP address consists of exactly four integers separated by single dots.
Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.

For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses,
but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
Given a string s containing only digits, return all possible valid IP addresses
that can be formed by inserting dots into s. You are not allowed to reorder or
remove any digits in s. You may return the valid IP addresses in any order.

Sample Testcase:1
----------------------------------------
input=25525511135
output=[255.255.11.135, 255.255.111.35]
import java.util.*;
class test
{
    public static void backtrack(String s, int start, List<String> parts, List<String> result)
    {
        if (parts.size()==4 && start==s.length())
        {
            result.add(String.join(".", parts));
            return;
        }
        if (parts.size()>=4)
        return;
        for (int len=1;len<=3 && start+len<=s.length();len++)
        {
            String part=s.substring(start,start+len);
            if (Valid(part))
            {
                parts.add(part);
                backtrack(s,start+len,parts,result);
                parts.remove(parts.size()-1);
            }
        }
    }
    public static boolean Valid(String part)
    {
        if (part.length()>1&&part.startsWith("0"))
        return false;
        int val = Integer.parseInt(part);
        return val >= 0 && val <= 255;
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<String> res=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),res);
        System.out.println(res);
    }
}
 */

/*
Given an array of distinct integers candidates and a target integer target,
return a list of all unique combinations of candidates where the chosen numbers
sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times.
Two combinations are unique if the frequency of at least one of the chosen
numbers is different.

The test cases are generated such that the number of unique combinations that
sum up to target is less than 150 combinations for the given input.

case=1
input=4
2 3 8 7
7
output=[[2, 2, 3], [7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
import java.util.*;
class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        List<List<Integer>> res= new ArrayList<>();
        backtrack(a,k,0,new ArrayList<>(),res);
        System.out.println(res);
    }
    public static void backtrack(int[] a,int k, int start, List<Integer>al, List<List<Integer>> res)
    {
        if (k==0)
        {
            res.add(new ArrayList<>(al));
            return;
        }
        if (k<0) return;
        for(int i=start;i<a.length;i++)
        {
            al.add(a[i]);
            backtrack(a,k-a[i],i,al,res);
            al.remove(al.size()-1);
        }
    }
}
 */

/*
Given a string containing digits from 2-9 inclusive, return all possible
letter combinations that the number could represent.
A mapping of digits to letters (just like on the telephone buttons)
is given below.

2-> a, b, c
3-> d, e, f
4-> g, h, i
5-> j, k, l
6-> m, n, o
7-> p, q, r, s
8-> t, u, v
9-> w, x, y, z

Note:'1' does not map to any letters. The result should be in ascending order.

Sample Testcase:1
----------------------------
input=2
output=[a, b, c]

Sample Testcase:2
----------------------------
input=23
output=[ad, ae, af, bd, be, bf, cd, ce, cf]
import java.util.*;
class test
{
    public static void backtrack(int i, int n, String s, StringBuilder sb, HashMap<Character, String> map ,List<String> res)
    {
       if(i==n)
        {
           res.add(sb.toString());
           return;
        }
        for(char ch:map.get(s.charAt(i)).toCharArray())
        {
            sb.append(ch);
            backtrack(i+1,n,s, sb, map, res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, String> map=new HashMap<>();
        map.put('0', "");
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String>res=new ArrayList<>();
        backtrack(0,s.length(),s,new StringBuilder(),map,res);
        System.out.print(res);
    }
}
 */

/*
Given the root of a binary tree, return the vertical order traversal of its
nodes' values. (i.e., from top to bottom, column by column).
If two nodes are in the same row and column, the order should be from
left to right.

Sample Testcase:1
----------------------------
input=7
3 9 20 -1 -1 15 7
output=[[9], [3, 15], [20], [7]]
/*class Node
{
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
import java.util.*;
class Solution
{
    List<List<Integer>> verticalOrder(Node root)
    {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Map<Integer,List<Integer>> Map= new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty())
        {
            Pair p = q.poll();
            Node node =p.node;
            int col =p.col;
            Map.putIfAbsent(col,new ArrayList<>());
            Map.get(col).add(node.data);
            if(node.left != null)
                q.add(new Pair(node.left,col-1));
            if(node.right != null)
                q.add(new Pair(node.right,col+1));
        }
        for(List<Integer>al:Map.values())
        {
            res.add(al);
        }
        return res;
    }
    static class Pair
    {
        Node node;
        int col;
        Pair(Node node, int col)
        {
            this.node=node;
            this.col=col;
        }
    }
}

 */

/*
Given a positive integer n, return the punishment number of n.

The punishment number of n is defined as the sum of the squares of all
integers i such that:

Sample Testcase:1
-------------------------------------
input=10
output=182

Explanation:
---------------------------------
There are exactly 3 integers i in the range [1, 10] that
satisfy the conditions in the statement:
- 1 since 1 * 1 = 1
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 and 1 with a sum
equal to 8 + 1 == 9.
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 and 0 with a
sum equal to 10 + 0 == 10.
Hence, the punishment number of 10 is 1 + 81 + 100 = 182

 */

/*
Akbar used to play chess with Birbal almost every evening.
Once Akbar has challanged Birbal to place the queens in each row of the board,
such that no queen should attack another queen on the board.

You are given an integer N, indicates the size of the board as N*N.
Your task is to help Birbal to find and win in this challange,
if there is a solution, print the answer as shown in the samples
Otherwise, print "No Solution"

Input Format:
-------------
An integer N, size of the chess board.

Output Format:
--------------
Print any possible solution.


Sample Input-1:
---------------
4  //no. of queens and 4*4 chessboard

Sample Output-1:
------------------
2 4 1 3
3 1 4 2


 */