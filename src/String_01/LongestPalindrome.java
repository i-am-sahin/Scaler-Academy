package String_01;

public class LongestPalindrome {
    public static int bruteforce(String str){
        int ans = 0;
        int n = str.length();
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if (isPalindrome.isPalindrome(str,i,j)){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(bruteforce("dabba"));
    }
}
