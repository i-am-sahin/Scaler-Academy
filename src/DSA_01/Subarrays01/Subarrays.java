package DSA_01.Subarrays01;
/*
 *
 * Subarray : A continuous part of Array!
 *
 *       Requirement for Being a subarray
 * --> It's Continuous part of the array.
 * --> A single element is also a subarray.
 * --> Complete array is also a subarray.
 * --> Order matters!
 *
 * Note : Each subarray can be defined in form of start and end index.
 *
 * */
public class Subarrays {

// Given an array A,S,E , Print subarray form S to E!


    public static  void printSubarraySToE(int A[],int s, int e){
        for (int start = s; start<=e;start++){
            System.out.print(A[start] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,0};
//        printSubarraySToE(a,2,6);
        printAllSubarrays(a);
    }

    //Given an A[],print all the subarrays!
    public static void printAllSubarrays(int A[]){
        //Idea: Run 3 loops, 1st loop for start index, 2nd loop is for end index & 3rd loop for Printing
        int n = A.length;
        //Iterate in start index
        for (int s = 0 ; s < n; s++){
            //Iterate in End Index
            for (int e = s; e < n; e++){
                //Print the Subarrays
                for (int k = s; k<= e;k++){
                    System.out.print(A[k] + " ");
                }
                System.out.println();
            }
        }
    }

}
