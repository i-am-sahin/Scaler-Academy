package DSA_01.Subarrays01;
/*Given an A[],Print The sum of Every Subarray.*/
public class Sum_Of_Every_Subarray {
    //Idea 01 : Run 3 loops, 1st for start index, 2nd for end index & 3rd loop for calculate the sum and print that!
    public static void solution01(int A[]){ //The Time Complexity of this solution is O(N^3) & space Complexity is O(1)!
        int n = A.length;
        //Iterate in Start Index
        for (int start = 0; start < n; start++){
            //Iterate in End index!
            for (int end = start; end < n; end++){
                //Claculate & print the sum;
                int sum = 0;
                for (int k =start; k<=end; k++){
                    sum+=A[k];

                }
                System.out.println(sum + " ");

            }
        }
    }

    //Idea 02 : Use Prefix Sun to Aviod Calculating sum Part!

    public static void solution02(int A[]){//The Time Complexity of this solution is O(N^2) & space Complexity is O(N)!
        int n = A.length;
        //Create Prefix Sum
        int ps[] = new int[n];
        ps[0] = A[0];
        //Iterate in PSum!
        for (int i = 1; i <n ;i++){
            ps[i] = ps[i-1] + A[i];
        }

        //Iterate in Start Index
        for (int start = 0; start < n; start++){
            //Iterate in End index!
            for (int end = start; end < n; end++){
                //Claculate & print the sum;
                int sum = 0;
                if(start == 0){
                    sum = ps[end];
                }
                else {
                    sum = ps[end] - ps[start-1];
                }
                System.out.println(sum + " ");

            }
        }

    }

    //Idea 03 : Carry Forward sum value in 2nd loop itself!
    public static void solution03(int A[]){ //The Time Complexity of this solution is O(N^2) & space Complexity is O(1)!
        int n = A.length;
        //Iterate in Start Index
        for (int start = 0; start < n; start++){
            //Iterate in End index!
            int sum = 0;
            for (int end = start; end < n; end++){
                //Claculate & print the sum;

                sum +=A[end];
                System.out.println(sum + " ");

            }
        }
    }


    public static void main(String[] args) {
        int a[] = {2,4,1};
//        solution01(a);
//        solution02(a);
        solution03(a);
    }

}
