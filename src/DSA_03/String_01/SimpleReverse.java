package DSA_03.String_01;

public class SimpleReverse {
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
