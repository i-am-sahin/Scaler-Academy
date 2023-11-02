package DSA_01.CarryForword;

/*
* Given a String of lowercase alphabets,Return the count of pairs[indices](i,j)
*   such that i < j and s[i] == 'a' And s[j] == 'g'
*
* Ex : a b c g a g   ==> 4
*
* Ex : "a a g g g" ==> 6
*
* */

public class Count_Of_Pairs {

//Approach 1 :First iterate into String , If s[i] =='g',Then Try to find s[j] == 'a' In Left site.

    public static int countPair01(String s){


        int n = s.length();
        int count = 0;

        for (int i = 0; i < n;i++){ // This Time complexity of this Code is O(N^2) & Space Complexity is O(1)
            if (s.charAt(i) == 'g'){
                for (int j = i; j>=0; j--){
                    if (s.charAt(j)=='a'){
                        count++;
                    }
                }
            }
        }
        return count;
    }
// Approach 2& Optimized Code : In this Approach , We Carry the value of 'a' .
    public static int countPair(String s){
        int count_a = 0;
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++){// This Time complexity of this Code is O(N) & Space Complexity is O(1).
            if (s.charAt(i) == 'a'){
                count_a++;
            } else if (s.charAt(i) == 'g') {
                ans += count_a;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "aaggg";
        System.out.println(countPair01(s));
        System.out.println(countPair(s));


    }
}
