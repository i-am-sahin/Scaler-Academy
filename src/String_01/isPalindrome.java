package String_01;

public class isPalindrome {
    /*
    Given a String, Starting index and End index.
    check if a given Substring is Palindrome or Not!
    * */
    public static boolean isPalindrome(String str, int s, int e){
        while (s <= e) {
            if (str.charAt(s) == str.charAt(e)) {
                s++;
                e--;
            } else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "sahin";
        System.out.println(isPalindrome(s,1,1));
    }
}
