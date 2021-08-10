import java.util.*;

public class countBinaryString{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    
    long[][] dp = new long[2][n + 1];
    
    // long w0 = countBinStr(n, 0, dp);
    // long w1 = countBinStr(n, 1, dp);
    // System.out.println(w0 + w1);
    System.out.println(countBinStrTab(n, dp));
    
    // for(int i = 0; i < 2; i++){
    //     for(int j = 0; j <= n; j++)
    //         System.out.print(dp[i][j] + " ");
    //     System.out.println();    
    // }
 }
 
 //recursive + memoized solution 
 public static long countBinStr(int n, int start, long[][] dp){
     //base condition
     if(n == 1)
        return dp[start][n] = 1;
      
     long w0 = 0, w1 = 0, ans = 0;
     
     if(dp[start][n] != 0)
        return dp[start][n];
     
     if(start == 0)
        w1 = countBinStr(n - 1, 1, dp);
     else if(start == 1){
         w0 = countBinStr(n - 1, 0, dp);
         w1 = countBinStr(n - 1, 1, dp);
     }
     
     ans = w0 + w1;
     return dp[start][n] = ans;
 }
 
 //tabulation based solution for count binary string problem
 public static long countBinStrTab(int n, long[][] dp){
     
     dp[0][1] = 1;
     dp[1][1] = 1;
     
     for(int c = 2; c <= n; c++){
         for(int r = 0; r < 2; r++){
             if(r == 0)
                dp[r][c] = dp[r + 1][c - 1];
             else if(r == 1)
                dp[r][c] = dp[r - 1][c - 1] + dp[r][c - 1];
         }
     }
     
     long ans = dp[0][n] + dp[1][n];
     return ans;
 }

}