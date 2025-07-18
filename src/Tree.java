public class Tree {
}
/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Sample Testcase:1
        ----------------------------------

input=1 -1 2 3
output=1 3 2

import java.util.*;
class test{
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        inorder(root,al);
        return al;
    }
    public void inorder(TreeNode root,List<Integer> al){
        if(root == null)
            return;
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
        //preorder
        //postorder
    }
}
*/
/*
//Level order traversal
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> l = new LinkedList<List<Integer>>();
        if(root==null)
        return l;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> sub = new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                sub.add(queue.poll().val);
            }
            l.add(sub);
        }
        return l;
    }
}
 */
/*
//SAME TREES
Given the roots of two binary trees p and q, write a function to check if they
are the same or not.

Two binary trees are considered the same if they are structurally identical,
and the nodes have the same value.

Sample Testcase:1
--------------------------
input=1 2 3
1 2 3
output=true

import java.util.*;
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p==null || q==null || p.val != q.val)
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

}
 */
/*
//SYMMETRY
Given the root of a binary tree, check whether it is a mirror of itself
 (i.e., symmetric around its center).

Sample Testcase:1
------------------------------
input=1 2 2 3 4 4 3
output=true

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }
    public boolean check(TreeNode p,TreeNode q){
        if(p == null && q==null)
            return true;
        else if(p == null || q == null || p.val != q.val)
            return false;
        return check(p.left,q.right) && check(p.right,q.left);
    }
}
 */
/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest
 path from the root node down to the farthest leaf node.

Sample Testcase:1
-----------------------------
input=3 9 20 -1 -1 15 7
output=3
//MAXDEPTH

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int depth=Math.max(leftDepth,rightDepth);
        return depth+1;
    }
}
 */

/*
A power company is designing a power distribution tree made up of bulbs with different voltage ratings.

The bulbs are arranged in a binary tree structure, level by level.
Level 0 contains the main power source (root bulb).
From level 1 onward, each bulb can have at most two child bulbs (left and right), connected directly.
A missing bulb is indicated by -1 in the input (i.e., an empty attachment).
The structure is provided in level-order format (i.e., top to bottom, left to right).
Your task is to:
Return an ArrayList containing the highest voltage bulb at each level of the power distribution tree.

Input Format:
-------------
A single line of space separated integers, voltages of the set of bulbs.

Output Format:
--------------
Print the list of voltages.


Sample Testcase:1
----------------------------
input=7
10 5 15 3 7 -1 20
output=[10, 15, 20]

Explanation:
----------------------------
Level 0: [10] → max = 10
Level 1: [5, 15] → max = 15
Level 2: [3, 7, 20] → max = 20

import java.util.*;
class Solution {
    public static ArrayList<Integer> getMaxPerLevel(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int levelMax = Integer.MIN_VALUE;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelMax = Math.max(levelMax, node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(levelMax);
        }

        return result;
    }
}
/*class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}
import java.util.*;
class Solution{
    public static ArrayList<Integer>getMaxPerLevel(TreeNode root){
        ArrayList<Integer> al = new ArrayList<>();
        Max(root,0,al);
        return al;
    }
    public static void Max(TreeNode node,int level,ArrayList<Integer> al){
        if(node == null)
            return;
        if(level == al.size()){
            al.add(node.val);
        }
        else{
            al.set(level,Math.max(al.get(level),node.val));
        }
        Max(node.left,level+1,al);
        Max(node.right,level+1,al);
    }
}

 */
/*
You are given the root of a binary tree containing digits from 0 to 9 only.
Each root-to-leaf path in the tree represents a number.
Return the total sum of all root-to-leaf numbers.

Sample Testcase:1
-------------------------------------
input=2 3 5 1 4 6 7
output=978


Explanation:
----------------------------------
2 → 3 → 1 = 231
2 → 3 → 4 = 234
2 → 5 → 6 = 256
2 → 5 → 7 = 257
Total: 231 + 234 + 256 + 257 = 978

class Solution
{
    int sumNumbers(Node root)
    {
        return sum(root,0);
    }
    public int sum(Node root,int s){
        if(root == null)
            return 0;
        s = s * 10+root.data;
        if(root.left == null && root.right == null)
            return s;
        return sum(root.left,s)+sum(root.right,s);
    }
}
 */
/*
Given the root of a binary tree, return all root-to-leaf paths in any order.
A leaf is a node with no children.


Sample test case:1
---------------------------------
input=5
1 2 3 -1 5
output=[[1, 2, 5], [1, 3]]

      1
     / \
    2   3
     \
      5

Explanation: There are two paths from root to lead are 1->2->5 and 1->3
public List<List<Integer>> binaryTreePaths(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;
    List<Integer> currentPath = new ArrayList<>();
    dfs(root, currentPath, result);
    return result;
}

private void dfs(TreeNode node, List<Integer> path, List<List<Integer>> result) {
    if (node == null) return;

    path.add(node.val);

    // If it's a leaf node, add the path to result
    if (node.left == null && node.right == null) {
        result.add(new ArrayList<>(path));
    } else {
        // Continue DFS on left and right children
        dfs(node.left, path, result);
        dfs(node.right, path, result);
    }

    // Backtrack to explore other paths
    path.remove(path.size() - 1);
}
 */
/*
A power company is designing a power distribution tree made up of bulbs with different voltage ratings.

The bulbs are arranged in a binary tree structure, level by level.
Level 0 contains the main power source (root bulb).
From level 1 onward, each bulb can have at most two child bulbs (left and right), connected directly.
A missing bulb is indicated by -1 in the input (i.e., an empty attachment).
The structure is provided in level-order format (i.e., top to bottom, left to right).
Your task is to:
Return an ArrayList containing the averages at each level of the power distribution tree.


Input Format:
-------------
A single line of space separated integers, voltages of the set of bulbs.

Output Format:
--------------
Print a list of double values (averages of each level)

Sample Input-1:
---------------
3 8 4 3 5 -1 7

Sample Output-1:
----------------
[3.0, 6.0, 5.0]

Sample Input-2:
---------------
3 8 4 3 5 7 7

Sample Output-2:
----------------
[3.0, 6.0, 5.5]
import java.util.*;
class Solution{
    public static ArrayList<Double> getAveragePerLevel(TreeNode root){
        ArrayList<Double> al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            double size=q.size();
            double sum=0.0;
            for(int i=0;i<size;i++){
                TreeNode n = q.poll();
                sum += n.val;
                if(n.left != null) q.offer(n.left);
                if(n.right != null) q.offer(n.right);
            }
            al.add(sum/size);
        }
        return al;
    }
}
 */
/*
You are given a set of integers set[] and a search element E,
last integer in the set[] is -1 indicates end of the binary tree.

You need to construct a binary tree, (Do not insert last integer, -1).
with the following property: left-node < parent-node < right-node.
The first number in the set[] is always root node.

Print the sub-tree, if you find the search element in the binary tree.
Otherwise, print "Not Found"

Input Format:
-------------
Line-1 : Space separated integers, set[] ending with -1.
Line-2 : An integer E, seacrh element.

Output Format:
--------------
Print the sub-tree in in-order traversal.


Sample Input-1:
---------------
4 2 6 1 3 5 6 -1
2

Sample Output-1:
----------------
1 2 3

Explanation:
------------
Given Binary Tree is:
				 4
				/  \
			    2   	6
			/  \   /   \
		1     3 5    7

Search element is 2:
sub-tree of 2 is->
		2
	   /  \
	  1    3
In-Order is : 1 2 3

===== HINT =====
The binary tree property given is left-node < parent-node < right-node.
Indicates you should build a Binary Search Tree.
You have to do three operations to achive the output.
	1) Insert into BST.
		- Insert the first element as root node, from second element onwards.
		- Compare the inserting element with root,
		  if less than root, then recurse for left, else recurse for right.
		- After reaching end, just insert that node at left(if less than current) else right.

	2) Search inBST.
		- Start from root.
		- Compare the search element with root,
		  if less than root, then recurse for left, else recurse for right.
		- If element to search is found anywhere, return true, else return false.

	3) Print result in In-Order (Left, Root, Right).
		- Traverse the left subtree.
		- Visit the root, print the value at root.
		- Traverse the right subtree.

class Solution
{
    public Node search(Node root, int key)
    {
        return func(root,key);
    }
    private static Node func(Node root,int key){
        if(root.key == key){
            return root;
        }
        else if(root.key> key){
            return func(root.left,key);
        }
        else
            return func(root.right,key);
    }
}
*/
/*
Bubloo is working with computer networks, where servers are connected
in a hierarchical structure, represented as a Binary Tree. Each server (node)
is uniquely identified by an integer value.

Bubloo has been assigned an important task: find the shortest communication
path (in terms of network hops) between two specific servers in the network.

Network Structure:
------------------
The network of servers follows a binary tree topology.
Each server (node) has a unique identifier (integer).
If a server does not exist at a certain position, it is represented as '-1' (NULL).

In Solution Class, Given the root of the network tree, and two specific
server IDs (E1 & E2), determine the minimum number of network hops (edges)
required to communicate between these two servers.

Input Format:
-------------
Space separated integers, elements of the tree.

Output Format:
--------------
Print an integer value.


Sample Input-1:
---------------
1 2 4 3 5 6 7 8 9 10 11 12
4 8

Sample Output-1:
----------------
4
Explanation:
------------
The edegs between 4 and 8 are: [4,1], [1,2], [2,3], [3,8]

Sample Input-2:
---------------
1 2 4 3 5 6 7 8 9 10 11 12
6 6

Sample Output-2:
----------------
0

Explanation:
------------
No edges between 6 and 6.

 */
/*
Given the root of a Binary Search Tree (BST), return the minimum absolute
difference between the values of any two different nodes in the tree.

Sample Testcase:1
-------------------------------------
input=4,2,6,1,3,-1,-1
output=1

import java.util.*;
class Solution {
    public int getMinimumDifference(TreeNode root) {
        int result=Integer.MAX_VALUE;
        List<Integer> list = new ArrayList();
        list = level(root);
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            int diff=Math.abs(list.get(i)-list.get(i-1));
            result = Math.min(result,diff);
        }
        return result;
    }
    public static List<Integer> level(TreeNode root){
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return l;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            l.add(node.val);
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);

        }
        return l;
    }
}
 */
/*
get the minimum difference between two nodes in a BST  - performing the level order traversal and collect the nodes , sort them the minimum difference is last - first
import java.util.*;

class Solution {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = level(root);

        Collections.sort(list); // To ensure we're comparing sorted values

        int result = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int diff = Math.abs(list.get(i) - list.get(i - 1));
            result = Math.min(result, diff);
        }
        return result;
    }

    public static List<Integer> level(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return l;

        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            l.add(node.val); // Collect the value here

            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }
        return l;
    }
}
 */

//Exam4
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
*/
/*
import java.util.*;
class Solution{
    int lowestCommonAncestor(Node root, int p, int q){
        // Implement your code here
        if(root==null) return 0;
        if(root.data == p || root.data == q )
            return root.data;
        int lh = lowestCommonAncestor(root.left, p, q);
        int rh = lowestCommonAncestor(root.right, p, q);
        if(lh ==0) return rh;
        else if(rh == 0) return lh;
        else
            return root.data;
    }
}
*/
/*

Given the root of a binary search tree, and an integer k, return the kth smallest
value (1-indexed) of all the values of the nodes in the tree.

Sample Testcase:1
-----------------------------------
input=3,1,4,-1,2
1
output=1


import java.util.*;

/*
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

 */
/*
public class Solution{
    public int kthSmallest(TreeNode root, int k){
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return 0;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            l.add(node.val);

            if(node.left != null)
                q.offer(node.left);
            if(node.right != null)
                q.offer(node.right);
        }
        Collections.sort(l);
        return l.get(k-1);
    }
}

other solution
 public int kthSmallest(TreeNode root, int k){
        List<Integer> l = new ArrayList<>();
        help(root,al);
        Collections.sort(l);
        return l.get(k-1);
    }
    public void help(TreeNode root,ArrayList<Integer> al){
        if(root == null)
            return;
            help(root.left,al);
            al.add(root.val);
            help(root.right,al);
    }
 */
/*
Given the root of a binary search tree and the lowest and highest boundaries as low and high,
trim the tree so that all its elements lies in [low, high]. Trimming the tree should not change
the relative structure of the elements that will remain in the tree (i.e., any node's descendant
should remain a descendant). It can be proven that there is a unique answer.

Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.


Sample Testcase:1
----------------------------------
input=1 0 2
1 2
output=1 2

Explanation:
------------------------------
root=[1,0,2], low = 1, high = 2
Output=1,-1,2

class Solution{
    public static TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null) return null;
        if(root.val<low) return trimBST(root.right,low,high);
        if(root.val>high) return trimBST(root.left,low,high);
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        return root;
    }
}
 */

/*
Given the root of a binary tree, return the tilt of the whole tree.
The tilt of a tree node is defined as the absolute difference between
the sum of all left subtree node values and the sum of all right subtree
node values.
The tilt of the whole tree is defined as the sum of all nodes' tilt.
    1
   / \
  2   3
Tilts: 2 → 0, 3 → 0, 1 → |2-3| = 1

Sample Testcase:1
--------------------------------
input=1 2 3
output=1

import java.util.*;
/*
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class Solution {
    private int total=0;
    public int findTilt(TreeNode root) {
        getSum(root);
        return total;
    }
    public int getSum(TreeNode root){
        if(root == null)
            return 0;
        int lsum = getSum(root.left);
        int rsum = getSum(root.right);
        int tilt = Math.abs(lsum - rsum);
        total += tilt;

        return root.val + lsum + rsum;
    }
}

 */

/*
Given an integer array nums where the elements are sorted in ascending order,
convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the
depth of the two subtrees of every node never differs by more than one.

Sample Testcase:1
-------------------------------------
input=-10 -3 0 5 9
output=0 -3 9 -10 null 5
 */
/*
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) { val = v; }
}
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(nums,0,nums.length-1);
    }
    public TreeNode BST(int[] nums,int l,int r){
        if(l>r)
            return null;

        int mid=l+(r-l)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = BST(nums,l,mid-1);
        root.right = BST(nums,mid+1,r);

        return root;
    }
}
 */
/*
Program to construct a binary tree and traverse the tree in
preorder, inorder, postorder

Sample Testcase:1
---------------------------------
input=1 2 3 4 5 6 7 8 9
output=
1 2 4 8 9 5 3 6 7
8 4 9 2 5 1 6 3 7
8 9 4 5 2 6 7 3 1

import java.util.*;


/*class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Solution {
    static  List<Integer> al = new ArrayList<>();
    static  List<Integer> al1 = new ArrayList<>();
    static  List<Integer> al2 = new ArrayList<>();

    public static List<Integer> preorder(Node root){
        if(root == null)
            return null;
        al.add(root.data);
        preorder(root.left);
        preorder(root.right);
        return al;
    }


    public static List<Integer> inorder(Node root) {
        if(root == null)
            return null;
        inorder(root.left);
        al1.add(root.data);
        inorder(root.right);
        return al1;
    }

    public static List<Integer> postorder(Node root) {
        if(root == null)
            return null;
        postorder(root.left);
        postorder(root.right);
        al2.add(root.data);
        return al2;
    }
}
 */
/*

Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Sample Testcase:1
------------------------------
input=3
2 1 3
output=true

input=7
5 1 4 -1 -1 3 6
Output=false
Explanation:
---------------------------
The root node's value is 5 but its right child's value is 4.
public class Solution {
    public boolean isValidBST(TreeNode root){
        return valid(root);
    }
    public boolean valid(TreeNode root){
        if(root == null)
            return true;
        if(root.left != null && root.left.val > root.val)
            return false;
        if(root.right != null && root.right.val < root.val)
            return false;
        return valid(root.left) && valid(root.right);
    }
}
 */
/*
Given the root of a binary tree, imagine yourself standing on the right side
of it, return the values of the nodes you can see ordered from top to bottom.

Sample Testcase:1
----------------------------
input=7
1 2 3 -1 5 -1 4
output=[1, 3, 4]
 */
/*
class Node
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
    List<Integer> rightSideView(Node root)
    {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;

        Queue<Node> q= new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node node = q.poll();

                if( i== size-1){
                    res.add(node.data);
                }
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
        }
        return res;
    }
}
*/
/*
Write a Java program to perform inorder traversal of a binary tree without using recursion.
Use a stack to simulate the traversal.

Input Format:
------------------------
A single line of space-separated integers representing level-order traversal of the binary tree.
Use -1 for null nodes.

Sample Testcase:1
---------------------------------------
input=1 2 3 -1 -1 -1 -1
output=2 1 3

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int val) { data = val; }
}
import java.util.*;
public class Soltuion {
    static void inorder(Node root) {
        Stack<Node> st=new Stack<>();
        Node current = root;
        while(!st.isEmpty() || current!=null){
            while(current != null){
                st.push(current);
                current=current.left;
            }
            current = st.pop();
            System.out.print(current.data+" ");
            current = current.right;
        }
    }
}
 */
/*
Write a Java program to count the number of leaf nodes in a binary tree without using recursion.
Use a stack for tree traversal.

Input Format:
---------------------------
A single line of space-separated integers in level-order.
Use -1 for null nodes.

Sample Testcase:1
-------------------------------
1 2 3 -1 -1 -1 -1
output=2

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int val) { data = val; }
}

public class Solution {
    static int countLeaves(Node root){
        int count=0;
        Stack<Node> st= new Stack<>();
        Node current = root;
        while(!st.isEmpty() || current!=null){
            while(current!=null){
                st.push(current);
                current=current.left;
            }
            current=st.pop();
            if(current.left==null && current.right==null){
                count++;
            }
            current=current.right;
        }
        return count;
    }
}
 */
/*
Write a Java program to find the height of a binary tree using an
iterative level-order traversal approach.

Input Format:
----------------------------
Space-separated integers in level-order format.
-1 represents null nodes.

Sample Testcase:1
----------------------------------
input=1 2 3 -1 -1 -1 -1
output=2

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int val) { data = val; }
}

public class Solution{
    static int height(Node root){
        int height=0;
        Queue<Node> queue = new LinkedList<>();
        if(root == null)
            return 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node node = queue.poll();
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            height++;
        }
        return height;
    }
}
 */
/*
Write a Java program to check if two binary trees are identical in structure and
data without using recursion. Use queues for iterative comparison.

Input Format:
------------------------------------
Two lines of space-separated integers (each line is a tree in level-order).
-1 represents null nodes.

Sample Testcase:1
-------------------------------
iput=1 2 3 -1 -1 -1 -1
1 2 3 -1 -1 -1 -1
output=2


import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int val) { data = val; }
}

public class Solution{
    static boolean isIdentical(Node root1, Node root2){
        Queue<Node> q1=new LinkedList<>();
        Queue<Node> q2=new LinkedList<>();

        q1.add(root1);
        q2.add(root2);

        if(root1==null && root2==null)
            return true;
        if(root1==null && root2==null || root1.data != root2.data)
            return false;
        while(!q1.isEmpty() && !q2.isEmpty()){
            Node n1=q1.poll();
            Node n2=q2.poll();


            q1.add(n1.left);
            q1.add(n1.right);
            q2.add(n2.left);
            q2.add(n2.right);
        }
        return q1.isEmpty() && q2.isEmpty();

    }

}
 */
/*
Alice is working with Binary Trees.
The elements of the tree is given in the level order format.
Alice is looking the tree from right side.
So, he can view only leftmost nodes only (one node per level).

You will be given the root of the binary tree.
Your task is to find the nodes which can be viewed by Alice from left side.
And print the nodes from top to bottom order.

Your task is to implement the class Solution:
	- public List<Integer> leftSideView(BinaryTreeNode root):
	return the list of node values.

NOTE:
Please do consider the node with data=-1 as null node in the given trees.

Input Format:
-------------
Space separated integers, elements of the tree.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
1 2 3 5 -1 -1 5

Sample Output-1:
----------------
[1, 2, 5]

 */

/*
import java.util.*;

class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left, right;

    public BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class LSView {
    static BinaryTreeNode buildTree(String[] arr) {
        if (arr.length == 0 || arr[0].equals("-1")) return null;

        BinaryTreeNode root = new BinaryTreeNode(Integer.parseInt(arr[0]));
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            BinaryTreeNode current = queue.poll();

            // Left child
            if (i < arr.length && !arr[i].equals("-1")) {
                current.left = new BinaryTreeNode(Integer.parseInt(arr[i]));
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && !arr[i].equals("-1")) {
                current.right = new BinaryTreeNode(Integer.parseInt(arr[i]));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public List<Integer> leftSideView(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                BinaryTreeNode current = queue.poll();
                // Add the first node (leftmost) at this level
                if (i == 0) {
                    result.add(current.data);
                }

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        BinaryTreeNode root = buildTree(arr);

        LSView sol = new LSView();
        List<Integer> output = sol.leftSideView(root);
        System.out.println(output);
    }
}

 */
/*
You are given the root of a binary tree where each node has a value 0 or 1.
Each root-to-leaf path represents a binary number starting
with the most significant bit.

For example, if the path is 0 -> 1 -> 1 -> 0 -> 1,
then this could represent 01101 in binary, which is 13.
For all leaves in the tree, consider the numbers represented by
the path from the root to that leaf. Return the sum of these numbers.


Sample Testcase:1
---------------------------------------
         1
        /\
       0  1
      /\  /\
     0 10 1
input=1 0 1 0 1 0 1
output=22
Explanation:
------------------------------------
(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22

import java.util.*;
public class Solution {
    public int sumRootToLeaf(TreeNode root)
    {
        return sum(root,0);
    }
    public int sum(TreeNode root,int s){
        if(root==null)
            return 0;
        s=s*10+root.val;
        if(root.left==null && root.right==null){
            String bin=Integer.toString(s);
            int total=Integer.parseInt(bin,2);
            return total;
        }
        return sum(root.left,s)+sum(root.right,s);
    }
}
 */