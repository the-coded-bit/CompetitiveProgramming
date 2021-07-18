import java.util.*;

public class countMinMoves {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sc.close();    
        //solved minimum no of moves using Tabulation DP
        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;
        
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for(int j = 1; j <= arr[i] && i + j <= n; j++){
                    if(dp[i + j] != null)
                        min = Math.min(min, dp[i + j]);
                }
                if(min != Integer.MAX_VALUE)
                    dp[i] = min + 1;
                else
                    dp[i] = null;
            }
        }
        System.out.println(dp[0]);
    }

}