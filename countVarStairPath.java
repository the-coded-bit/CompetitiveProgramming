import java.util.*;


//question is to count Stair paths of variable size
public class countVarStairPath {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        int ans = CountPaths(n, arr, 0);
        System.out.println(ans);
    }
    
   public static int CountPaths(int n, int[] arr, int sum) {

        // base condition
        if (sum == n) {
            return 1;
        } else if (sum > n)
            return 0;


        int options = arr[sum];
        int ans = 0;
        for(int i = 1; i <= options; i++){
            ans = ans + CountPaths(n, arr, sum + i);
        }  
        
        return ans;
    }

}