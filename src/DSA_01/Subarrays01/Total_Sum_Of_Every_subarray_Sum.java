package DSA_01.Subarrays01;
/*
*
* Given an A[], find the total Sum of every subarray sum!
*
* */
public class Total_Sum_Of_Every_subarray_Sum {
    //Idea01 : Calculate the sum and add it to tatal sum
    public static void solution01(int A[]){ //The Time Complexity of this solution is O(N^2) & space Complexity is O(1)!
        int n = A.length;
        int totalSum = 0;
        //Iterate in Start Index
        for (int start = 0; start < n; start++){
            //Iterate in End index!
            int sum = 0;
            for (int end = start; end < n; end++){
                //Calculate & print the sum & totalSum;
                sum +=A[end];
                totalSum+=sum;
            }

        }
        System.out.println(totalSum);
    }
    // Idea 02: Contribution Technique
    public static void solution02(int A[]){
        int n = A.length;
        int total_sum = 0;
        for (int i = 0; i < n; i++){
            int freq = (i+1) *(n-i); // How many time this particular element contribute
            int sum = freq *A[i];
            total_sum+=sum;
        }
        System.out.println(total_sum);
    }

    public static void main(String[] args) {
        int A[] = {2,4,1};
//         solution01(A);
        solution02(A);
    }

}
