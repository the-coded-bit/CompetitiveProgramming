import java.util.*;

public class maximumSumNonAdjacent {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        sc.close();
        System.out.println(maxNonAdjSumTab(arr, n));    
    }
    
    //this is recursive solution for maximum sum non adjacent elements
    // this solution obviously gives TLE but recursive solution to think is nice
    public static int maxNonAdjSum(int[] arr, int idx){
        // base condition
        if(idx > arr.length - 1)
            return 0;
        
        int acc = arr[idx] + maxNonAdjSum(arr, idx + 2);
        int nacc = 0 + maxNonAdjSum(arr, idx + 1);
        
        int ans =  Math.max(acc, nacc);
        return ans;
    }
    
    //optimised tabular based solution
    //tabular solution still got TLE
    //watching solution vedio
    public static int maxNonAdjSumTab(int[] arr, int n){
        int inc = arr[0], exc = 0;
        
        for(int i = 1; i < n; i++){
            int ninc = exc + arr[i];
            int nexc = Math.max(inc, exc);
            
            inc = ninc;
            exc = nexc;
        }
        
        int ans = Math.max(inc, exc);
        return ans;
    }
}