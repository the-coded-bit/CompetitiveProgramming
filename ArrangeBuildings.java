import java.util.*;

public class ArrangeBuildings{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    // long swb = arrangeBuildings(n, 'b');
    // long sws = arrangeBuildings(n, 's');
    
    // System.out.println((swb + sws) * (swb + sws));
    System.out.println(arrangeBuildingsTab(n));
    
 }
 
 //recursive solution for arrange buildings 
public static long arrangeBuildings(int n, char start){
    //base condition
    if(n == 1)
        return 1;
    long wb = 0, ws = 0;
    if(start == 'b')
        ws = arrangeBuildings(n - 1, 's');
    else if(start == 's'){
        wb = arrangeBuildings(n - 1, 'b');
        ws = arrangeBuildings(n - 1, 's');
    }
    
    long ans = wb + ws;
    return ans;
}

//tabulation based solution for arrange buildings question
public static long arrangeBuildingsTab(int n){
    
     long[][] dp = new long[2][n + 1];
     
     dp[0][1] = 1;
     dp[1][1] = 1;
     
     for(int c = 2; c <= n; c++){
         for(int r = 0; r < 2; r++){
             if(r == 0)
                dp[r][c] = dp[r + 1][c - 1];
             else if(r == 1)
                dp[r][c] = dp[r - 1][c - 1] + dp[r][c - 1];
         }
     }
     
     long ans = dp[0][n] + dp[1][n];
     return ans * ans;
 }

}