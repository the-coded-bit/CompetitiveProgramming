import java.util.*;

public class TargetSumDP {

    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int tar = sc.nextInt();
        sc.close();
        
        
        boolean[][] dp = new boolean[n][tar + 1];
        System.out.println(isSumSubset(arr, 0, 0, tar, dp));
        display(dp);
    }
    
    public static boolean isSumSubset(int[] arr, int idx, int sum, int tar, boolean[][] dp) {
        // base case
        if(idx == arr.length){
            if(sum != tar)
                return false;
            else
                return true;    
        }
        else if(sum > tar)
            return false;
        if(dp[idx][sum] == true)
            return true;
        boolean b = false;

        boolean aa = isSumSubset(arr, idx + 1, sum + arr[idx], tar, dp);
        boolean na = isSumSubset(arr, idx + 1, sum, tar, dp);

        if (aa == true || na == true)
            b = true;
        else if(aa == false && na == false) 
            b = false;
            
        dp[idx][sum] = b;
        return b;
    }

    private static void display(boolean[][] arr){
        for(int i  = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();   
        }
    }
}