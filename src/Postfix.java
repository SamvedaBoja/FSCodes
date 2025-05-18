
/*
Imagine you are building the backend of a scientific calculator app.
When users enter expressions like "5 + 3 * 2", your app needs to first
 convert the infix expression to postfix so that it can easily and quickly
evaluate the result.

Postfix form removes the need for brackets and reduces confusion in operator precedence (like *, /, +, -).
It helps your app to calculate expressions faster and more accurately.

Sample Testcase:1
------------------------------------
input=a+b+c+d)
output=ab+c+d+
 */
import java.util.*;
class Postfix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                res.append(c);
            }
            else if(c == '(')
            {
                stack.push(c);
            }
            else if(c == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                    res.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() == '(')
                {
                    stack.pop();
                }
            }
            else
            {
                while(!stack.isEmpty())
                {
                    char top = stack.peek();
                    int pres_top = -1;
                    int pres_curr = -1;
                    if(top == '+' || top == '-')pres_top = 1;
                    else if(top == '*' || top == '/')pres_top = 2;
                    if(c == '+' || c == '-') pres_curr = 1;
                    else if(c == '*' || c == '/') pres_curr = 2;
                    if(pres_curr<=pres_top) res.append(stack.pop());
                    else break;
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) res.append(stack.pop());
        System.out.println(res);
    }
}