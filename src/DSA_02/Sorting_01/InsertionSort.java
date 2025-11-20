package DSA_02.Sorting_01;
import java.util.Random;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        int j;
        for (int i = 1; i < n;i++){
            int curr = arr[i];
            j = i - 1;
            while (j >=0 && arr[j] > curr){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
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
        insertionSort(arr);

        System.out.println("After Sorting : ");
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
