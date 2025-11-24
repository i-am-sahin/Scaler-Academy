package DSA_03.String_01;

public class SimpleReverse {
    /*

                Simple Reverse
    Problem Description

Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints

1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format

First and only argument is a string A.



Output Format

Return a string denoting the reversed string.



Example Input

Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output

Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation

Explanation 1:

 Reverse the given string.

    */
    public static String solve(String A) {
        StringBuilder ans = new StringBuilder();
        int n = A.length();
        int start = 0, end = n-1;
        for(int i = end; i >= 0; i--){
            ans.insert(start,A.charAt(i));
            start++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String rev = solve("Sahin");
        System.out.println(rev);
    }
}
