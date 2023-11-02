package DSA_01.CarryForword;

public class Leaders_In_An_array {
//Approach 1
    public static int leaders01(int arr[]){
        int ans = 1;
        int n = arr.length;

        for (int i = 1;i < n; i++){
            boolean flag = true;
            for (int j = 0; j < i;j++){
                if (arr[j] > arr[i]){
                    flag = false;
                }
            }
            if (flag == true){
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[]    =  {2,5,3,4,17,16};
        System.out.println(leaders01(arr));

    }
}
