import java.util.*;
//solved count variable stair path with Tabulation DP technique

public class countVariableStairPathDP {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        
        int[] dp = new int[n + 1];
        dp[n] = 1;
        
        for(int i = n - 1; i >= 0; i--) {
            for(int j = 1; j <= arr[i] && i + j <= n ; j++){
                dp[i] += dp[i + j];
            }
        }
        
        System.out.println(dp[0]);
    }
    
//   public static int CountPaths(int n, int[] arr, int sum) {

//         // base condition
//         if (sum == n) {
//             return 1;
//         } else if (sum > n)
//             return 0;


//         int options = arr[sum];
//         int ans = 0;
//         for(int i = 1; i <= options; i++){
//             ans = ans + CountPaths(n, arr, sum + i);
//         }  
        
//         return ans;
//     }

}