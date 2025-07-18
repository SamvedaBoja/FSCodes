/*
Given a square grid of characters in the range ascii[a-z], rearrange
elements of each row alphabetically, ascending. Determine if the columns
are also in ascending alphabetical order, top to bottom.
Return YES if they are or NO if they are not.

For example, given:
a b c
a d e
e f g
The rows are already in alphabetical order. The columns a a e , b d f and
c e g are also in alphabetical order, so the answer would be YES .
Only elements within the same row can be rearranged. They cannot be
moved to a different row.

Input Format:
------------------------------------
The first line contains , the number of rows and columns in the grid.
Each string consists of lowercase letters in the range ascii[a-z]

Output Format:
-------------------------------
print YES if it is possible to rearrange the grid alphabetically ascending
in both its rows and columns, or NO otherwise.

Sample Testcase:1
----------------------------------
input=5
ebacd
fghij
olmkn
trpqs
xywuv

Output=
YES

Explanation:
-------------------------------------------------------
The x grid in the test case can be reordered to
abcde
fghij
klmno
pqrst
uvwxy
This fulfills the condition since the rows 1, 2, ..., 5 and the columns 1, 2, ..., 5 are all lexicographically sorted.

 */
public class PatternMatrix {
}
