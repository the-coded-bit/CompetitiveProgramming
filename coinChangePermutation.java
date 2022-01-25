public class coinChangePermutation {

    public static int coinChangePermutationRecursive(int[] a, int n, int target){
        //base condition 
        if(target == 0) return 1;
        if(target < 0) return 0;

        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += coinChangePermutationRecursive(a, n, target - a[i]);
        }

        return ans;
    }

    public static int coinChangePermutationTab(int[] a, int target){
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i - a[j] >= 0){
                    dp[i] += dp[i - a[j]];
                }
            }
        }
        return dp[target];
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5};
        System.out.println(coinChangePermutationRecursive(a, 3, 7));
        System.out.println(coinChangePermutationTab(a, 7));
    }
}
