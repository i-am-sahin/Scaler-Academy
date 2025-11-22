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

    public static void main(String[] args) {
        System.out.println(bruteforce("dabba"));
    }
}
