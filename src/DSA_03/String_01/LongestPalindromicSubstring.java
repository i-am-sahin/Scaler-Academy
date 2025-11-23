package DSA_03.String_01;

public class LongestPalindromicSubstring {
    /*      Q2. Longest Palindromic Substring
    Problem Description

Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints

1 <= N <= 6000



Input Format

First and only argument is a string A.



Output Format

Return a string denoting the longest palindromic substring of string A.



Example Input

Input 1:
A = "aaaabaaa"
Input 2:
A = "abba


Example Output

Output 1:
"aaabaaa"
Output 2:
"abba"


Example Explanation

Explanation 1:
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2:
We can see that longest palindromic substring is of length 4 and the string is "abba".


    */
    public static String longestPalindrome(String A) {
        String evenLength = maxLengthEvenPalindrome(A);
        String oddLength = maxLengthOddPalindrome(A);
        if(oddLength.length() > evenLength.length())
            return oddLength;
        return evenLength;
    }
    private static String maxLengthOddPalindrome(String str) {
        int n = str.length();
        int maxOddPalindromeLength = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for(int c = 0; c < n; c++){
            int p1 = c;
            int p2 = c;
            while (p1 >= 0 && p2 < n){
                if (str.charAt(p1) == str.charAt(p2)){
                    p1--;
                    p2++;
                }else {
                    break;
                }
            }
            int len = p2 - p1 - 1;

            if (len > maxOddPalindromeLength) {
                maxOddPalindromeLength = len;
                maxStart = p1 + 1;
            }
        }


        return str.substring(maxStart , maxStart + maxOddPalindromeLength );


    }

    private static String maxLengthEvenPalindrome(String str) {
        int n = str.length();
        int maxEvenPalindromeLength = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for(int c = 0; c < n; c++){
            int p1 = c;
            int p2 = c + 1;
            while (p1 >= 0 && p2 < n){
                if (str.charAt(p1) == str.charAt(p2)){
                    p1--;
                    p2++;
                }else {
                    break;
                }
            }

            int len = p2 - p1 - 1;

            if (len > maxEvenPalindromeLength) {
                maxEvenPalindromeLength = len;
                maxStart = p1 + 1;
            }

        }
        return str.substring(maxStart , maxStart + maxEvenPalindromeLength );
        // return maxEvenPalindromeLength;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aabbsadhinmadammalayalamabba(()("));
    }
}
