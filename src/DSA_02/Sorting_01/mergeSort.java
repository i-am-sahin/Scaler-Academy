package DSA_02.Sorting_01;

public class mergeSort {
    public static void mergeSort(int[] a,int L,int R){
        if(L == R){
            return;
        }
        int mid = (L + R) / 2;
        mergeSort(a,L,mid);
        mergeSort(a, mid + 1,R);
        merge(a,L,mid,R);
    }

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
        for (int x = L; i < R; x++) {
            a[x] = ans[x];
        }
        return a; //T.C : O(N)
    }


    public static void main(String[] args) {
        int[] a = {1,2,45,0,67,2,1,-10,22,55,6,2};

    }
}
