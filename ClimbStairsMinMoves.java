import java.util.*;

public class ClimbStairsMinMoves {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sc.close();    
        System.out.println(minMoves(arr, n, 0));
    }
    
    
    public static int minMoves(int[] arr, int tar, int  idx){
        //base case
        if(idx == tar)
            return 0;
        else if(idx > tar)
            return Integer.MAX_VALUE - 20;
        else if(arr[idx] == 0)
            return Integer.MAX_VALUE - 20;
        
        int options = arr[idx];
        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i <= options; i++){
           int m = minMoves(arr, tar, idx + i) + 1;
           min = Math.min(m, min);
        }
        
        return min;
    }

}