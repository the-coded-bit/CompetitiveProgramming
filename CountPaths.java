import java.util.*;

public class CountPaths {
    //this question counts the stair paths from n to 0 by taking 1,2,3 steps at a time
    //this question is solved using memoization technique
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(CountPathsTab(n));
        
    }
    
    public static int CountStairPaths(int n, int[] qb){
        
        if(n == 0)
            return 1;
        else if(n < 0)
            return 0;
            
        if(qb[n] != 0)
            return qb[n];
        
        int nm1 = CountStairPaths(n - 1, qb);
        int nm2 = CountStairPaths(n - 2, qb);
        int nm3 = CountStairPaths(n - 3, qb);
        
        int ans = nm1 + nm2 + nm3;
        //this is memoization technique
        qb[n] = ans;
        return ans;
    }

     //this function uses tabulation technique to calculate count of stair paths from n to 0
     public static int  CountPathsTab(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        
        for(int i = 1; i < n + 1; i++){
            if(i == 1)
                dp[i] = dp[i - 1];
            else if(i == 2)
                dp[i] = dp[i - 1] + dp[i - 2];
            else
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        
        return dp[n];
    } 

}