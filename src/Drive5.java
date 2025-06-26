/*
Tree Puzzle
-------------------

Shifu was good at solving problems involving trees. So one day as a challenge.
Master Oogway gave him a problem. He gave Shifu the post-order and in-order traversals of a tree and asked him to tell the elements in a sequential orler present between two levels of that tree whose index he had provided himself.
Input Specification:
---------------------
input1: The in-order traversal of the tree. input2: The post-order traversal of the tree. input3: The lower level I' input4: The higher level 'h'
13
Output Specification:
-----------------------
Return the array representing the elements present between Input3 and Input levels of the tree.
Example 1: input1: (2,1,3) input2: (2,3,1)
input3: 1
input4: 2
Output: (1.2.3)


 */
/*
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class Drive5 {

    static int postIndex;

    public static void main(String[] args) {
        int[] inOrder = {2, 1, 3};
        int[] postOrder = {2, 3, 1};
        int l = 1;
        int h = 2;

        List<Integer> result = solve(inOrder, postOrder, l, h);
        System.out.println(result); // Output: [1, 2, 3]
    }

    public static List<Integer> solve(int[] inOrder, int[] postOrder, int l, int h) {
        postIndex = postOrder.length - 1;
        TreeNode root = buildTree(inOrder, postOrder, 0, inOrder.length - 1);
        return getNodesBetweenLevels(root, l, h);
    }

    private static TreeNode buildTree(int[] inOrder, int[] postOrder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        int rootVal = postOrder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        int inIndex = findIndex(inOrder, rootVal, inStart, inEnd);

        // Build right first, because in postorder, right subtree comes before left
        root.right = buildTree(inOrder, postOrder, inIndex + 1, inEnd);
        root.left = buildTree(inOrder, postOrder, inStart, inIndex - 1);

        return root;
    }

    private static int findIndex(int[] arr, int val, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }

    private static List<Integer> getNodesBetweenLevels(TreeNode root, int l, int h) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // Collect nodes at current level if in range
            if (level >= l && level <= h) {
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    result.add(node.val);
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
            } else {
                // Still need to traverse but not collect
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
            }

            level++;
        }

        return result;
    }
}

 */

/*
Hierarchy
You are given a string(S) of digits. All the digitsrare Os or 15. Each 0 represents a dead node and each 1 represents an alive node. Assuming that the Oth digit in the string is the oldest, a family tree is created in the following manner.
	•	  0t" node is the root
        •	  Every alive node must have 2 children
	•	  Dead nodes cannot have children
	•	  the ith node in the string is elder than i= 1) node and any node is made the child of the eldest node alive with 0 or 1 children.
	•	  In the family tree, elder child of a node is on the left and younger child is on the right
	•	  If no node is alive at any layer, then the construction is stopped and this tree is accepted as the final family tree.
Your task is to find the height of the family tree for a given string S.
Input Specification:
input1: String of 0s and 1s
Output Specification:
        Return H, Height of the family tree.

Example 1: input1: 111
Output: 1
Explanation:

Example 2: input1: 1001
Output 1
*/

/*
import java.util.*;

class Node {
    int level;
    int children;
    Node(int level) {
        this.level = level;
        this.children = 0;
    }
}

public class HierarchyTreeHeight {

    public static int getHeight(String S) {
        if (S == null || S.length() == 0) return -1;

        Queue<Node> queue = new LinkedList<>();

        // First node (root)
        if (S.charAt(0) == '0') return 0;

        Node root = new Node(0); // Level 0
        queue.offer(root);

        int maxHeight = 0;

        for (int i = 1; i < S.length(); i++) {
            // Find the first node in queue that can take a child
            while (!queue.isEmpty() && queue.peek().children == 2) {
                queue.poll(); // Remove fully filled node
            }

            if (queue.isEmpty()) break; // No parent can take more children

            Node parent = queue.peek();
            Node current = new Node(parent.level + 1);
            parent.children++;

            if (S.charAt(i) == '1') {
                queue.offer(current); // Only alive nodes go to the queue
            }

            maxHeight = Math.max(maxHeight, current.level);
        }

        return maxHeight;
    }

    public static void main(String[] args) {
        System.out.println(getHeight("111"));   // Output: 1
        System.out.println(getHeight("1001"));  // Output: 1
        System.out.println(getHeight("111011")); // Output: 2
    }
}
 */