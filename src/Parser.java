
/*
You own a Goal Parser that can interpret a string command. The command consists
 of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will
 interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.


Sample Testcase:1
-----------------------------
input=G()(al)
output=Goal
Explanation:
---------------------------
The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".


Constraints:
----------------------------------

1 <= command.length <= 100
command consists of "G", "()", and/or "(al)" in some order.

 */
import java.util.*;

class Parser

{


    public static void main(String[] args)

    {


        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); )

        {


            if (s.charAt(i) == 'G')

            {


                result.append('G');
                i++;


            } else if (s.charAt(i) == '(' && s.charAt(i + 1) == ')')

            {


                result.append('o');
                i += 2;


            } else if (s.charAt(i) == '(' && s.charAt(i + 1) == 'a' && s.charAt(i + 2) == 'l' && s.charAt(i + 3) == ')')

            {


                result.append("al");
                i += 4;


            }


        }

        System.out.println(result.toString());


    }

}