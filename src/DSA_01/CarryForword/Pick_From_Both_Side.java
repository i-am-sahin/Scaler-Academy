package DSA_01.CarryForword;

public class Pick_From_Both_Side {
    public static int solve(int[] A, int B) {
       int n = A.length;
       int Prefixsum[] = new int[n];
       Prefixsum[0] =A[0];
       for (int i = 1;i <n;i++){
           Prefixsum[i] = Prefixsum[i-1] +A[i];
       }
       int Ssum[] = new int[n];
       Ssum[n-1] = A[n-1];
       for (int i = n-2; i>=0;i--){
           Ssum[i] = Ssum[i+1] + A[i];
       }

        int ans = Math.max(Prefixsum[B-1],Ssum[n-B]);

       for (int i =1; i<B;i++){
           int sum = Prefixsum[i-1] +Ssum[n-(B-i)];
           ans = Math.max(sum,ans);
       }


        return  ans;
    }

    public static void main(String[] args) {
        int Arrrr[] = {-533,-666,-500,169,724,478,358,-38,-536,705,-855,281,-173,961,-509,-5,942,-173,436,-609,-396,902,-847,-708,-618,421,-284,718,895,447,726,-229,538,869,912,667,-701,35,894,-297,811,322,-667,673,-336,141,711,-747,-132,547,644,-338,-243,-963,-141,-277,741,529,-222,-684,35};

        System.out.println(solve(Arrrr,48));
    }
}
