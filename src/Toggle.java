/*
/*
Gopal is given a list of integers.
Your task to is find out, the length of the longest subsequence that is a
toggle sequence.

Toggle Sequence means, the difference between the consecutive numbers
are alternate positive and negative.

For Example:
Given list of integers = 1 3 2 5 4
the consecutive differences are [ 2, -1, 3, -1],
the differences are alternate +ve and -ve.
So, complete list is a toggle sequence.

If the list of integers = 1 3 2 4 5,
the consecutive differences are [ 2, -1, 2, 1], not alternate +ve and -ve.
Not a toggle sequence.

Note: A sequence with fewer than two elements is a toggle sequence.

Input Format:
-------------
Space separated Integers, List

Output Format:
--------------
Print the length of the longest toggle sequence


Sample Input-1:
---------------
1 7 4 9 2 5

Sample Output-1:
----------------
6

Explanation:
------------
Given list of integers = 1 7 4 9 2 5
the consecutive differences are [ 6, -3, 5, -7, 3],
the differences are alternate +ve and -ve.
So, complete list is a toggle sequence.

Sample Input-2:
---------------
1 5 4 3 7 9 10

Sample Output-2:
----------------
4

Explanation:
------------
Given list of integers = 1 5 4 3 7 9 10
the consecutive differences are [ 4, -1, -1, 4, 2, 1],
the differences are alternate +ve and -ve.
So, there are more than one toggle sequences of length 4.

*/


public class Toggle {
}
