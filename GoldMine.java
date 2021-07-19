import java.util.*;

public class GoldMine {

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
        
        for(int j = m - 1; j >= 0; j--){
            for(int i = n- 1; i >= 0; i--) {
                if(j == m - 1)
                    dp[i][j] = arr[i][j];
                else if(i == n - 1){
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i-1][j + 1]) + arr[i][j];
                }
                else if(i == 0){
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j + 1]) + arr[i][j]; 
                }
                else{
                    dp[i][j] = Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1])) + arr[i][j];
                }
            }
        }
     int maxi = 0;   
     for(int i = 0; i < n; i++){
         maxi = Math.max(dp[i][0], maxi);
     } 
     System.out.println(maxi);
    }

}