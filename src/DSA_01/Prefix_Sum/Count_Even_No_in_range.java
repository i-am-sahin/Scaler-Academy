package DSA_01.Prefix_Sum;

public class Count_Even_No_in_range {

    /*
    *
    * Given an Array & Q query , find the count of even numbers for every query.
    * */

    //Bruteforce Idea : Go to Every query,iterate left to right , calculate how many even numbers are present;
        //For this approach T.C will be O(Q*N) && S.C will be O(1)!!!

    //Optimization : Create an Array like Prefix Sum,Who count even number
    public static int[] pEven(int A[]){
        int n = A.length;
        int PE[] = new int[n];
        if (A[0] % 2 == 0){
            PE[0] = 1;
        }
        else {
            PE[0] = 0;
        }
        for (int i = 1; i < n ;i++){
            if (A[i] % 2 == 0){
                PE[i] = PE[i-1] + 1;
            }
            else{
                PE[i] = PE[i-1];

            }
        }
//        for(int i = 0; i < n;i++){
//            System.out.print(PE[i] + " ");
//        }

        return PE;
    }
    public static int[] solve(int A[],int Q[][]){
        int n = Q.length;
        int pc[] = pEven(A);
        int ans[] = new int[n];

        for (int i = 0; i < n;i++){
            int L = Q[i][0];
            int R = Q[i][1];
            if (L == 0){
                ans[i] = pc[R];
            }
            else {
                ans[i] = pc[R] - pc[L-1];
            }
        }
        for (int i =0; i < n; i++){
            System.out.print(ans[i]);
        }

        return  ans;
    }
    public static void main(String[] args) {
//        int[] A = {1,2,3,4,8,6,10,9};
//        pEven(A);
        int[]A = {3,5,8,9,16,14,13,12};
        int[][]Q = {
                {1,5},
                {2,6},
                {4,5},
                {4,4},
                {3,6}
        };

        solve(A,Q);
    }
}
