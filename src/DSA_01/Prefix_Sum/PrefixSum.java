package DSA_01.Prefix_Sum;
/*
* Given an array Create prefixSum Array where,
*
* p[i] = A[0] + A[1] + A[2] +.......... + A[i]
* */
public class PrefixSum {

    public static int[] pSum(int[] A){
        int n = A.length;
        int ps[] = new int[n];
        ps[0] = A[0];
        for (int i = 1; i < n;i++){
            ps[i] = ps[i-1] + A[i];
        }
        //output
//        for (int i = 0; i < n;i++){
//            System.out.print(ps[i] + " ");
//        }
//        System.out.println();
        return ps;
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,5,6};

        pSum(a); // T.C : O(n);  S.C : O(n/1)

    }

}
