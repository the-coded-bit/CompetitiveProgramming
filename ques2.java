import java.util.Scanner;
 
public class ques2 {
 
    
    static int countOfSubstringWithKOnes(String s, int k)
    {
        int N = s.length();
        int res = 0;
        int count = 0;
        int []freq = new int[N+1];
     
        
        freq[0] = 1;
     
        for (int i = 0; i < N; i++) {

            count += (s.charAt(i) - '0');
     
            if (count >= k) {
                res += freq[count - k];
            }
            freq[count]++;
        }
         
        return res;
    }
     
    static public void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int k = sc.nextInt();
        
        int res = countOfSubstringWithKOnes(str, k);
        if(res == 0){
            System.out.println(-1);
        }
        else
            System.out.println(res);

        sc.close();    
    }
}