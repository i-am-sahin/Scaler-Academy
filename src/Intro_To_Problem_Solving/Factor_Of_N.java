package Intro_To_Problem_Solving;
/*
Question
* Given N, Return no. Of factors of N
* */


public class Factor_Of_N {

    public static int countfactor(int n){
        int c = 0;
        for (int i = 1;i<=n;i++){ // N Iterations
            if (n%i == 0){
                c++;
            }
        }
        return c;
    }

    //Optimized This Above Code

    public static int OtimizedCountFactor(int n){
        int c = 0;

        for (int i = 1; i*i < n;i++){ //SQRt of N Iterations
            if(i == n/i){
                c++;
            }
            else{
                c+=2;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(countfactor(10));
        System.out.println(OtimizedCountFactor(12));

    }

}
