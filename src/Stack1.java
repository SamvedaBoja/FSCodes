/*
Write a program to perform the stack operations
push(), pop(), top(), and retrieving the minimum element in constant time.

The order of operations are:
1. void push(int E) -- Inset element E onto stack.
2. void pop() -- Delete the element on top of the stack.
3. int top() -- Print the top element.
4. int getMin() -- Print the minimum element in the stack.
0. to Stop the execution.

Input Format:
-------------
	-	Each Line consist of Operation number from the list [ 1, 2, 3, 4, 0 ],
		and list of space separated parameters if any.
	for better understanding check sample testcases.

Output Format:
--------------
Print integers in new line.


Sample Input-1:
---------------
1 -2
1 0
1 -3
4
2
3
4
0

Sample Output-1:
----------------
-3
0
-2

*/
import java.util.*;

class Stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        while (true) {
            int n = sc.nextInt();
            switch (n) {
                case 1: // push
                    int val = sc.nextInt();
                    stack.push(val);
                    if (minStack.isEmpty() || val <= minStack.peek()) {
                        minStack.push(val);
                    } else {
                        minStack.push(minStack.peek()); // repeat current min
                    }
                    break;

                case 2: // pop
                    if (!stack.isEmpty()) {
                        stack.pop();
                        minStack.pop();
                    }
                    break;

                case 3: // top
                    if (!stack.isEmpty())
                        System.out.println(stack.peek());
                    break;

                case 4: // getMin
                    if (!minStack.isEmpty())
                        System.out.println(minStack.peek());
                    break;

                case 0: // stop
                    return;
            }
        }
    }
}
/*
import java.util.*;

class MinStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Push operation
    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        } else {
            minStack.push(minStack.peek());
        }
    }

    // Pop operation
    public void pop() {
        if (!mainStack.isEmpty()) {
            mainStack.pop();
            minStack.pop();
        }
    }

    // Top operation
    public int top() {
        return mainStack.peek();
    }

    // GetMin operation
    public int getMin() {
        return minStack.peek();
    }
}

public class Stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack stack = new MinStack();

        while (true) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    int val = sc.nextInt();
                    stack.push(val);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    System.out.println(stack.top());
                    break;

                case 4:
                    System.out.println(stack.getMin());
                    break;

                case 0:
                    return;
            }
        }
    }
}

 */