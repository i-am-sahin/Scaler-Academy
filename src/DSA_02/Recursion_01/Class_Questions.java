package DSA_02.Recursion_01;

public class Class_Questions {
    /*
    * Question 1: Sum of N natural Number Using Recursion
    *
    *
    * */
    public static int sumOfNautralNums(int n){
        if (n == 0){
            return  0;
        }
        return sumOfNautralNums(n-1) +n;
    }

    /*
    * Question 2: Factorial Using Recursion
    *
    * Given N. find out factorial of N, using Recursion.
    * ex :  5! = 5 X 4 X 3 X 2 X 1 = 120
    *
    * */
    public static int factorial(int n){ //T.C : O(N), S.C : O(N)
        if (n <= 1){
            return 1;
        }
        return factorial(n-1) *n;
    }

    /*
    *
    * Question3 : Fibonacci Series
    *
    * Given n, return nth fibonacci number
    *
    * note :  starting number of fib is 0(is in 0th index) , 1(is in 1st index)
    * fib(n) = fib(n-1) + fib(n -2)
    * */

    public static int fib(int n){  // T.C : O(2^N) S.C : O(N)
        if(n == 0 || n ==1) return n;
        return fib(n-1) + fib(n-2);
    }

    /*
    * Question 4: Check if a String is a Palindrome.
    * */
    public static boolean isPalindrome(String s, int l, int r){
        if(l >= r) return true;
        return ((s.charAt(l) == s.charAt(r)) && isPalindrome(s,l+1,r-1));
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("madam",0,4));
    }
}
