import java.util.*;

public class minimumPathSum {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }
        sc.close();
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                dp[i][j] = -1;
        }
        
       // System.out.println(minCost(arr, 0, 0, n, m, dp));
       System.out.println(minCostTab(arr, n, m, dp));
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(dp[i][j] + " ");
            System.out.println();    
        }
    }
    
    //recursive + memoized solution for minimum cost in maze traversal
    public static int minCost(int[][] arr, int r, int c, int n, int m, int[][] dp){
        //base condition 
        if(r == n - 1 && c == m - 1)
            return dp[r][c] = arr[r][c];
        else if(r == n || c == m)
            return Integer.MAX_VALUE;
        
        if(dp[r][c] != -1)
            return dp[r][c];
            
        
        int rp1 = minCost(arr, r + 1, c, n, m, dp);
        int cp1 = minCost(arr, r, c + 1, n, m, dp);
        
        int ans = Math.min(rp1, cp1) + arr[r][c];
        return dp[r][c] = ans;
    }
    
    
    //tabulation solution for minimum cost in maze traversal
    public static int minCostTab(int[][] arr, int n, int m, int[][] dp){
        
        
        dp[n - 1][m - 1] = arr[n - 1][m - 1];
        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                if(i == n - 1 && j == m - 1)
                    continue;
                else if(i == n - 1){
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                }
                else if(j == m - 1)
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                else{
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j + 1]) + arr[i][j];
                }    
            }
        }
        
        return dp[0][0];
    }

}