package DSA_02.Sorting_01;


public class MergeAandB {
    /*
    * Given A and B sorted Array Create a new Sorted Array
    * */
    public static int[] mergeTwoSortedArray(int[] a,int[] b){
        int n = a.length;
        int m = b.length;
        int[] ans = new int[n+m];

        int p1 = 0,p2 = 0,i = 0;

        while (p1 < n && p2 < m){
            if(a[p1] < b[p2]){
                ans[i] = a[p1];
                p1++;
                i++;

            }
            else {
                ans[i] = b[p2];
                p2++;
                i++;
            }
        }
        while (p1 < n){
            ans[i] = a[p1];
            i++;
            p1++;
        }
        while (p2 < m){
            ans[i] = b[p2];
            i++;
            p2++;
        }


        return ans; // T.C : O(N+M), S.C :O(n+m)
    }



    /*
    * Given An Array A and L,M and R,where L to M is sorted and M + 1 to R is sorted.now sort the whole array.
    *
    * */

    public static int[] merge(int[] a,int L,int M,int R){
        int n = a.length;
        int[] ans = new int[n];


        int p1 = L,p2 = M+1,i = 0;

        while (p1 <= M && p2 <= R){
            if(a[p1] < a[p2]){
                ans[i] = a[p1];
                p1++;
                i++;

            }
            else {
                ans[i] = a[p2];
                p2++;
                i++;
            }
        }
        while (p1 <= M){
            ans[i] = a[p1];
            i++;
            p1++;
        }
        while (p2 <= R){
            ans[i] = a[p2];
            i++;
            p2++;
        }
        return ans; //T.C : O(N)
    }

    public static void main(String[] args) {
        int[] a = {1,2,5,6,88,98};
        int[] b = {44,52,61,95,101,223};
        int ans[] = mergeTwoSortedArray(a,b);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }


        int[] a = {1,2,3,5,7,99,111,222,2,3,10,12,55,66,69,89,222,333};
        int[] ans2 = merge(a,0,7,a.length-1);
        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i] + " ");
        }
    }
}
