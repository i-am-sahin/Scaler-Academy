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


        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,2,5,6,88,98};
        int[] b = {44,52,61,95,101,223};
        int ans[] = mergeTwoSortedArray(a,b);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
