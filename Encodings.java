import java.util.*;

public class Encodings {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        // System.out.println(countEncodings(s));
        System.out.println(countEncodingsTab(s));
        
    }
    

    //recursive solution for count Encodings
    public static int countEncodings(String s){
        //base condition
        if(s.equals(""))
            return 1;
        else if(s.length() == 1){
            if(s.charAt(0) == '0')
                return 0;
            else
                return 1;
        }
        
        
        int s1 = Integer.parseInt("" + s.charAt(0));
        int s2 = Integer.parseInt(s.substring(0,2));
        
        int w1 = 0, w2 = 0;
        
        if(s1 <= 26)
            w1 = countEncodings(s.substring(1));
        if(s2 <= 26)
            w2 = countEncodings(s.substring(2));
            
        int ans = w1 + w2;
        return ans;
    }
    
    //tabulation solutioon for count Encodings
    public static int countEncodingsTab(String s){
        int[] dp = new int[s.length()];
        dp[0] = 1;
        
        for(int i = 1; i < s.length(); i++){
             if(s.charAt(i - 1) == '0' && s.charAt(i) == '0'){
                 dp[i] = 0;
             }
             else if(s.charAt(i - 1) == '0' && s.charAt(i) != '0'){
                 dp[i] = dp[i - 1];
             }
             else if(s.charAt(i - 1) != '0' && s.charAt(i) == '0'){
                 if(Integer.parseInt(s.substring(i - 1, i + 1)) <= 26)
                    dp[i] = (i >= 2)? dp[i - 2] : 1; 
             }
             else{
                 dp[i] = dp[i - 1];
                 if(Integer.parseInt(s.substring(i - 1, i + 1)) <= 26)
                    dp[i] = dp[i] +  ((i >= 2)? dp[i - 2] : 1);
             }
        }
        return dp[s.length() - 1];
    }
}