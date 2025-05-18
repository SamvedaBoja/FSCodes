/*
Given a square board of n*n size, filled with n*n characters in the range ascii[a-z],
        Sort the characters of each row alphabetically, ascending.
        Determine if the columns are also in ascending alphabetical order, top to bottom.
        Return "true", if they are
        Otherwise "false"

        Input Format:
        -------------
        Line-1 : An integer n,Size of the board.
        Next n lines: string of length n.

        Output Format:
        --------------
        Print a boolean value.

        Sample Input-1:
        ---------------
        5
        ebacd
        fghij
        olmkn
        trpqs
        xywuv


        Sample Output-1:
        ----------------
        true


        Sample Input-2:
        ---------------
        5
        ebacd
        olmkn
        fghij
        trpqs
        xywuv

        Sample Output-2:
        ----------------
        false

 */
import java.util.*;
class ValidSequence{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        char mat[][]=new char[n][n];

        for(int i=0;i<n;i++){
            char row[] = sc.nextLine().toCharArray();
            Arrays.sort(row);
            mat[i] = row;
        }

        boolean flag=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(mat[j][i] > mat[j+1][i]){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
/*
import java.util.*;

class ValidSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[][] mat = new char[n][n];

        // Read input and sort each row
        for (int i = 0; i < n; i++) {
            char[] row = sc.nextLine().toCharArray();
            Arrays.sort(row); // sort the row
            mat[i] = row;
        }

        // Check if each column is sorted
        boolean isValid = true;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n - 1; row++) {
                if (mat[row][col] > mat[row + 1][col]) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid) break;
        }

        System.out.println(isValid ? "true" : "false");
    }
}

 */