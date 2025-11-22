package DSA_03.String_01;

public class ToggleCase {

    /*

    Q1. Toggle Case

Problem Description

You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.



Problem Constraints

1 <= N <= 105

A[i] ∈ ['a'-'z', 'A'-'Z']



Input Format

First and only argument is a character string A.



Output Format

Return a character string.



Example Input

Input 1:

 A = "Hello"
Input 2:

 A = "tHiSiSaStRiNg"


Example Output

Output 1:

 hELLO
Output 2:

 ThIsIsAsTrInG


Example Explanation

Explanation 1:

 'H' changes to 'h'
 'e' changes to 'E'
 'l' changes to 'L'
 'l' changes to 'L'
 'o' changes to 'O'
Explanation 2:

 "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".

     */
    public static String solve(String A){
        int n = A.length();
        StringBuilder s = new StringBuilder(A);
        for(int i = 0; i < n; i++){
            if(s.charAt(i) < 97){
                s.setCharAt(i, (char)(s.charAt(i) + 32));
            }else{
                s.setCharAt(i, (char)(s.charAt(i) - 32));
            }

        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("saHInIsagOoDBoy"));
    }
}
