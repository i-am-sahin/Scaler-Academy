package DSA_03.String_01;

import static DSA_03.String_01.IsPalindrome.isPalindrome;

public class LongestPalindrome {
    public static int bruteforce(String str){
        int ans = 0;
        int n = str.length();
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if (isPalindrome(str,i,j)){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans; // T.C : O(n^3), S.C: O(1)
    }

    //Optimization

    /*

    Idea: Every Palindrome has a center, find the center and iterate the left and right and check.

    For given center find the longest Palindrome,
    divide the problem into two parts,
    i) OddLengthPalindrome
    ii)evenLengthPalindrome

    then find the max palindrome
    */

    public static int longestPalindromicSubString(String str){
        int evenLength = maxLengthEvenPalindrome(str);
        int oddLength = maxLengthOddPalindrome(str);
        return Math.max(evenLength,oddLength);
    }

    private static int maxLengthOddPalindrome(String str) {
        int n = str.length();
        int maxOddPalindromeLength = 0;
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
            int currentMaxLength = p2 - p1 - 1;
            maxOddPalindromeLength = Math.max(maxOddPalindromeLength,currentMaxLength);
        }
        return maxOddPalindromeLength;
    }

    private static int maxLengthEvenPalindrome(String str) {
        int n = str.length();
        int maxEvenPalindromeLength = 0;
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
            int currentMaxLength = p2 - p1 - 1;
            maxEvenPalindromeLength = Math.max(maxEvenPalindromeLength,currentMaxLength);
        }
        return maxEvenPalindromeLength;
    }

    public static void main(String[] args) {
        System.out.println(bruteforce("dabba"));

        System.out.println(longestPalindromicSubString("abyzzybx"));
    }
}
