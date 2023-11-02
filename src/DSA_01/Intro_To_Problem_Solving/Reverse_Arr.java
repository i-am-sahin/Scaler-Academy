package DSA_01.Intro_To_Problem_Solving;
/*Given Arr[N] Elements & index S and E
    Reverse Arr[] form [S to E]
    Note : S<= E
*/
public class Reverse_Arr {

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
    public static void main(String[] args) {
        int[] arr = {-3,4,7,8,7,9,6,2,10,24};
        reverseRange(arr,1,8);
        int n = arr.length;
        for (int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }


    }
}
