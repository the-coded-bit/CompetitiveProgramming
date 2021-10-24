import java.util.Scanner;

public class codeagon1 {

    //this is question is based on DP the question is to reduce the number n to 1 
    // having 3 choices such as reducing by (n-1)
    //reducing by n/2 if n%2== 0
    //reducing by n/3 if n%3 == 0

    //this is solution using recursion
    public static int reduceTo1(int n ){
        //base condition
        if(n == 1)
            return 0;
        int ans = 0, anb3 = Integer.MAX_VALUE, anb2 = Integer.MAX_VALUE, anm1 = Integer.MAX_VALUE;
        if(n % 3 == 0){
            anb3 = 1 + reduceTo1(n/3);
        }    
        if(n % 2 == 0){
            anb2 = 1 + reduceTo1(n/2);
        }
        anm1 = 1 + reduceTo1(n - 1);
        ans = Integer.min(anb3, Integer.min(anb2, anm1));
        return ans;
    }

    //solution using Tabulation
    public static int reduceTo1Tab(int n){
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; i++) dp[i] = -1;
        dp[1] = 0;

        for(int i = 2; i <= n; i++){
            int anb2 = Integer.MAX_VALUE, anb3 = Integer.MAX_VALUE, anm1 = Integer.MAX_VALUE;
            if(i%2 == 0) anb2 = 1 + dp[i/2];
            if(i%3 == 0) anb3 = 1 + dp[i/3];
            anm1 = 1 + dp[i - 1];
            dp[i] = Integer.min(anm1, Integer.min(anb2, anb3));
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(reduceTo1(n));
        System.out.println(reduceTo1Tab(n));
    }
}
