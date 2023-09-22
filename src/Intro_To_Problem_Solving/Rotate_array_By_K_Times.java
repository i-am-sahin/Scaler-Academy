package Intro_To_Problem_Solving;

/*
*   Given Arr[N] and K ; Rotate array form last to first by K times
* Note : You cann't Create another Array
*
*
* */
public class Rotate_array_By_K_Times {

    public static void reverseRange(int[] arr, int s, int e){
        int p1 = s;
        int p2 = e;
        while ( p1< p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;p2--;
        }

    }
   public static void Rotate(int ar[],int k){
        int n = ar.length;
        reverseRange(ar,0,n-1);
        reverseRange(ar,0,k-1);
        reverseRange(ar,k,n-1);
    }

    public static void main(String[] args) {

        int arr[] = {-2,3,1,4,6,3,8,7,9,3};
        int k = 3;
        int n = arr.length;
        Rotate(arr,k);
        for (int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
