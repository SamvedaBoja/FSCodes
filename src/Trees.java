public class Trees {
}
/*
Given an array, construct a binary search tree and perform level
order traversal of the BST.

Input Format:
--------------------------
Line-1 size of array
Line-2 array elements

Output Format:
---------------------------
Print list of elements after traversal

Sample Testcase:1
--------------------------
input=5
2 4 6 8 5
output=[2, 4, 6, 5, 8]

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
*/
/*
import java.util.*;
class Solution
{
    Node BST(int[] nums)
    {
        Node root = null;
        for(int num:nums){
            root = bst(root,num);
        }
        return root;
    }
    Node bst(Node root,int ele){
        if(root==null){
            return new Node(ele);
        }
        if(ele<root.data){
            root.left=bst(root.left,ele);
        }
        else
            root.right=bst(root.right,ele);
        return root;
    }
}
 */
/*
//BALANCED BINARY TREE
class Solution {
    public boolean isBalanced(TreeNode root) {
        return bal(root) != -1;
    }
    public int bal(TreeNode root){
        if(root == null)
        return 0;
        int l = bal(root.left);
        int r = bal(root.right);
        if(l == -1 || r == -1) return -1;
        if(Math.abs(l-r) > 1) return -1;
        return 1+Math.max(l,r);
    }
}
 */
/*
//DIAMETER OF BT
class Solution {
    int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        return maxi;
    }
    public int findMax(TreeNode root){
        if(root==null)
        return 0;
        int lh=findMax(root.left);
        int rh=findMax(root.right);
        maxi=Math.max(maxi,lh+rh);
        return 1+Math.max(lh,rh);
    }
}
 */
/*
//unique binary search trees

import java.math.BigInteger;
class Solution {
    public int numTrees(int n) {
        BigInteger res = BigInteger.ONE;
        // Compute C(2n, n)
        for (int i = 0; i < n; i++) {
            res = res.multiply(BigInteger.valueOf(2 * n - i))
                     .divide(BigInteger.valueOf(i + 1));
        }
        // Divide by (n + 1)
        res = res.divide(BigInteger.valueOf(n + 1));
        return res.intValue();  // Safe since result < 2^31 for n <= 19

        /*
        int result =0;
        if(n==1 || n==0){
            return 1;
        }
        for(int i=0;i<n;i++){
            result += numTrees(i)*numTrees(n-i-1);
        }
        return result;
        
    }
            }
 */
/*
You are given two Binary Search Trees (BSTs), each containing distinct integers. Your task is to:

Perform in-order traversal of each BST to extract sorted lists.

Merge all three sorted lists into a single sorted list.

Construct a balanced Binary Search Tree (BST) from the merged list.

Print the in-order traversal of the final balanced BST.

Sample Testcase:1
---------------------------------
input=3
2 1 4
3
5 3 6
output=[1, 2, 3, 4, 5, 6]

import java.util.*;

/*
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}
*/
/*
public class Solution {

    public static TreeNode insert(TreeNode root, int val) {
        if(root == null)
            return new TreeNode(val);
        if(val < root.val){
            root.left = insert(root.left,val);
        }
        else
            root.right = insert(root.right,val);
        return root;
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }

    public static List<Integer> merge(List<Integer> l1,List<Integer> l2){
        /*
       List<Integer> l3 = new ArrayList<>();
       int i=0,j=0;
       while(i<l1.size() && j<l2.size())
       l1.addAll(l2);

        for(int i:l2){
            l1.add(i);
        }
        Collections.sort(l1);
        return l1;

    }

    public static TreeNode buildBST(List<Integer> arr, int low, int high) {
        if(low>high)
            return null;
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = buildBST(arr,low,mid-1);
        root.right = buildBST(arr,mid+1,high);
        return root;
    }

}
*/
