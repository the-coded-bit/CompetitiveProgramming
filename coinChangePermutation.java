import java.util.*;

public class coinChangePermutation {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int amt = sc.nextInt();
        sc.close();
        
        int[] dp = new int[amt + 1];
        // System.out.println(ccPermutation(arr, amt, dp));
        System.out.println(ccPermutationTab(arr, amt, dp));
        
        // for(int i = 0; i <= amt; i++)
        //     System.out.print(dp[i] + " ");
    }
    
    //recursive + memoized solution for coin change permutation
    public static int ccPermutation(int[] arr, int tar, int[] dp){
        //base condition
        if(tar == 0)
            return dp[tar] = 1;
        else if(tar < 0)
            return 0;
            
        if(dp[tar] != 0)
            return dp[tar];
        
        int count = 0;
        for(int i = 0; i < arr.length; i++){
                count = count + ccPermutation(arr, tar - arr[i], dp);
        }
        
        return dp[tar] = count;
    }
    
    //tabulation based solution for coin change permutation
    public static int ccPermutationTab(int[] arr, int tar, int[] dp){
        dp[0] = 1;
        for(int i = 1; i <= tar; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(i - arr[j] >= 0)
                    count = count + dp[i - arr[j]];
            }
            dp[i] = count;
        }
        
        return dp[tar];
    }
}