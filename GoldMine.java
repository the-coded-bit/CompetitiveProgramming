import java.util.*;

public class GoldMine {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
          
        int[][] dp = new int[n][m];
        
        // int maxi = 0;
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         maxi = Math.max(maxGold(arr, i, j, dp), maxi);
        //     }
        // }
        
        // System.out.println(maxi);
        System.out.println(maxGoldTab(arr, n, m, dp));
        
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++)
        //         System.out.print(dp[i][j] +" ");
        //     System.out.println();    
        // }
        
        
    }
    
    //recursive + memoization solution for Goldmine
    public static int maxGold(int[][] arr, int r, int c, int[][] dp){
        
        //base condition
        if(c == arr[0].length || r < 0 || r == arr.length)
            return 0;
        
        
        int up_right = maxGold(arr, r - 1, c + 1, dp);
        int right = maxGold(arr, r, c + 1, dp);
        int d_right = maxGold(arr, r + 1, c + 1, dp);
        
        if(dp[r][c] != 0)
            return dp[r][c];
        
        int ans = Math.max(up_right, Math.max(right, d_right)) + arr[r][c];
        return dp[r][c] = ans;
    }
    
    
    
    //tabulation solution for Goldmine
    public static int maxGoldTab(int[][] arr, int n, int m, int[][] dp){
        
        for(int c = m - 1; c >= 0; c--){
            for(int r = n - 1; r >= 0; r--){
                if(c == m - 1)
                    dp[r][c] = arr[r][c];
                else if(r == 0)
                    dp[r][c] = Math.max(dp[r][c + 1], dp[r + 1][c + 1]) + arr[r][c];
                else if(r == n - 1)
                    dp[r][c] = Math.max(dp[r][c + 1], dp[r - 1][c + 1]) + arr[r][c];
                else
                    dp[r][c] = Math.max(dp[r + 1][c + 1], Math.max(dp[r][c + 1], dp[r - 1][c + 1])) + arr[r][c];
            }
        }
        
        
        int maxi = 0;
        for(int i = 0; i < n; i++)
            maxi = Math.max(dp[i][0], maxi);
            
        return maxi;    
    }
}