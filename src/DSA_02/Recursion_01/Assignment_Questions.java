package DSA_02.Recursion_01;

public class Assignment_Questions {

    /*
    * Question 1 : You are given an integer A, print A to 1 using  recursion.
    * ex : A = 5 : O/P: 5 4 3 2 1.
    * */
    public static void printAToOne(int A) { //T.C : O(n)   S.C : O(n)
        if(A == 0){
            System.out.println();
            return;
        }
        System.out.print(A + " ");
        printAToOne(A-1);

    }

    /*
    *  Question 4:   You are given an integer A, print 1 to A using  recursion.
    * Ex : A= 5 : O/P : 1 2 3 4 5
    * */
    public static void oneToA(int A){
        if (A == 0 ) return;
        oneToA(A-1);
        System.out.print(A + " ");
    }

    public static void main(String[] args) {
        oneToA(5);
        System.out.println();
    }
}
