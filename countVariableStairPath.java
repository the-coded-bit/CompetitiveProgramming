
import java.util.*;

public class countVariableStairPath {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        CountPaths(n, arr, "", 0);
    }

    public static void CountPaths(int n, int[] arr, String psf, int sum) {

        // base condition
        if (sum == n) {
            System.out.println(psf);
            return;
        } else if (sum > n)
            return;


        int options = arr[sum];
        for(int i = 1; i <= options; i++){
            CountPaths(n, arr, psf + i, sum + i);
        }    
    }

}