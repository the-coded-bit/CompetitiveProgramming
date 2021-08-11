import java.util.*;

public class DistinctSubsequence {

    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        
        // System.out.println(countPatternSubsequences(str, 0, 0, 0, ' '));
        System.out.println(countPatternSubsequencesTab(str));
    }
    //recursive solution for a+b+c+ subsequences problem
    public static int countPatternSubsequences(String s, int counta, int countb, int countc, char last){
        //base condition
        if(s.equals("")){
            if(counta >= 1 && countb >= 1 && countc >= 1)
                return 1;
            else
                return 0;
        }
        
        
        int acc = 0, nacc = 0;
        char ch = s.charAt(0);
        
        if((ch - last) < 0){
            acc = 0;
            nacc = countPatternSubsequences(s.substring(1),counta, countb, countc, last);   
        }
        else{
             if(ch == 'a'){
            acc = countPatternSubsequences(s.substring(1), counta + 1, countb, countc, ch);
            nacc = countPatternSubsequences(s.substring(1), counta, countb, countc, last);
        }
        else if(ch == 'b'){
            acc = countPatternSubsequences(s.substring(1), counta, countb + 1, countc, ch);
            nacc = countPatternSubsequences(s.substring(1), counta, countb, countc, last);
        }
        else if(ch == 'c'){
            acc = countPatternSubsequences(s.substring(1), counta, countb, countc + 1, ch);
            nacc = countPatternSubsequences(s.substring(1), counta, countb, countc, last);
        }    
        }
        
        
        int ans = acc + nacc;
        return ans;
    }
    //tabulation solution for count a+b+c+ subsequences
    public static int countPatternSubsequencesTab(String s){
        int a = 0, ab = 0, abc = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a')
                a = 2 * a + 1;
            else if(ch == 'b')
                ab = 2 * ab + a;
            else
                abc = 2 * abc + ab;
        }
        
        return abc;
    }
}