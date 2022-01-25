
public class countBinaryString {

    public static int cntBinStr(int n, int init){

        //base condition
        if(n == 1) return 1;
        
        int fo = 0, fz = 0;
        if(init == 0){
            fo = cntBinStr(n - 1, 1);
        }
        else{
            fo = cntBinStr(n - 1, 1);
            fz = cntBinStr(n - 1, 0);
        }

        return fo + fz;
    }

    public static int cntBinStrTab(int n){
        int[][] dp = new int[2][n + 1];
        dp[0][1] = 1;
        dp[1][1] = 1;
        for(int i = 2; i < n + 1; i++){
            dp[0][i] = dp[1][i -1];
            dp[1][i] = dp[1][i - 1] + dp[0][i - 1];
        } 
        return dp[1][n];
    }
    public static void main(String[] args) {
        System.out.println(cntBinStr(3 + 1, 1));
        System.out.println(cntBinStrTab(5));
    }
}
