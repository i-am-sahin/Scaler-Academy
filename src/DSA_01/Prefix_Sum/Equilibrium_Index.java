package DSA_01.Prefix_Sum;

public class Equilibrium_Index {

    /*
    *
    * Given array,Find the count equilibrium Index
    * */
//BruteForce Idea : Go to Every index, find Left sum & Right Sum & Compare them!
    //T.C for this Approach is O(N^2) & S.C : O(1);

    //Optimizing Using Prefix Sum!!

    public static int solve(int A[]){
        int ps[] = PrefixSum.pSum(A);
        int count = 0;
        int n = A.length;

        for (int i = 0; i < n;i++){
            int ls = 0;
            if (ls != 0){
                ls = ps[i-1];
            }
            int rs = ps[n-1] -ps[i];
            if (ls == rs){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int a[] = {0,1,1,3,2};
        System.out.println(solve(a));

    }
}
