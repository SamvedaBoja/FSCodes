
/*

You are building the backend for a simple mobile calculator app.
When a user enters a complex expression (for example, "5 + 6 * 7"), your app
internally converts it to postfix (56+7*) and then evaluates the postfix
expression to quickly compute the final result.

This process:
Avoids confusion about parentheses.
Makes calculation faster and more efficient for the app.

Sample Testcase:1
----------------------------------
input=42*63/+5-
output=5
 */
import java.util.*;
class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<ex.length();i++)
        {
            char ch = ex.charAt(i);
            if(Character.isDigit(ch))
            {
                stack.push(ch - '0');

            }
            else

            {

                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                switch(ch)

                {

                    case '+':
                        result = a+b;
                        break;
                    case '-':
                        result = a-b;
                        break;
                    case '*':
                        result = a*b;
                        break;
                    case '/':
                        result = a/b;
                        break;


                }
                stack.push(result);

            }


        }
        System.out.println(stack.pop());

    }

}