package DSA_01.Prefix_Sum;
/*
*
* Given an Array & Q queries, find the sum for all
* queries in the given range
*
*
* */
public class Range_Sum_Queries {

    //BruteForce: For every query, find left and right from queries.Then travel from L To R & find Sum
    public static void solve(int[] A, int[][] Q){ // T.C : O(n^2);  S.C : O(1)
        for (int i=0; i < Q.length;i++){
            int left  = Q[i][0];
            int right = Q[i][1];
            int sum = 0;
            for (int j = left; j<= right;j++){
                sum+=A[j];
            }
            System.out.print(sum + " ");
        }
    }

    //Optimization : Use Prefix Sum
    public static int[] solve2(int A[],int Q[][]){
        int ps[] = PrefixSum.pSum(A);
        int n = Q.length;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++){
            int left = Q[i][0];
            int right = Q[i][1];
            if (left == 0){
                ans[i] = ps[right];
            }
            else{
                ans[i] = ps[right] - ps[left-1];
            }
        }

        for (int i = 0; i < n;i++){
            System.out.print(ans[i] + " ");
       }
        return ans;
    }

    public static void main(String[] args) {

        int[]A = {3,4,-2,6,8,10,13,1};
        int[][]Q = {
                {1,3},
                {2,6},
                {5,5},
                {0,3}
        };
//        solve(A,Q);
        solve2(A,Q);


    }
}
