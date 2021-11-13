public class diceThrow {
    public static int countWays(int n, int m, int x, int dice, int ssf){
        //base condition
        if(dice == 0){
            if(ssf == 0)
                return 1;
            else
                return 0;    
        }
        int ans = 0;
        for(int i = 1; i <= m; i++){
            ans += countWays(n, m, x, dice - 1, ssf - i);
        }
        return ans;
    }

    public static long countWaysTab(int d, int f, int target){

        int mod = (int)1e9+7;
        int[][] dp= new int[d + 1][target + 1];
        dp[0][0] = 1;
        for(int i = 1; i <= d; i++){
            for(int j = 1; j <= target; j++){
                for(int k = 1; k <= f; k++){
                    if(j >= k){
                        dp[i][j] += dp[i - 1][j - k] % mod;
                    }
                }
            }
        }

        return dp[d][target];
        
    }

    public static void main(String[] args) {
        System.out.println(countWaysTab(30, 30, 500));
    }
}
