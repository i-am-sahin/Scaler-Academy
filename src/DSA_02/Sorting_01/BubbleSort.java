package DSA_02.Sorting_01;

import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(int A[]){
        int n = A.length;
        for (int i = 0; i < n; i++){
            int flag = 0;
            for (int j = n - 1; j >= i+1;  j--) {
                if(A[j] < A[j - 1]){
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break; // if flag is 0 then there is no iteration happen!
            }
        }
    }
    public static void main(String[] args) {
        int n = 10;
        Random r = new Random();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(10);
        }

        System.out.println("Before Sorting : ");
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);

        System.out.println("After Sorting : ");
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
