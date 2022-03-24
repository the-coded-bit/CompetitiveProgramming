import java.util.Scanner;

public class q2 {

    public static int countConsonants(String s){

        int count = 0;
        for (int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
               System.out.print("");
            }else if(ch != ' '){
               count++;
            }
         }
         return count;
    }

    public static String check(String[] s){
        int min = Integer.MAX_VALUE;
        String res = "";
        int[] arr = new int[s.length];
        for(int i = 0; i < s.length; i++){
            arr[i] = countConsonants(s[i]);
        }


        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        
        for(int i = 0; i < s.length; i++){
            if(arr[i] == min){
                return s[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] inarr = s.split(",");
        int m = sc.nextInt();

        int[][] inmatrix = new int[m][2];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                inmatrix[i][j] = sc.nextInt();
            }
        }


        for(int i = 0; i < m; i++){
            int charnum = inmatrix[i][0];
            int replacewith = inmatrix[i][1];
            

            String str = inarr[i];
            char charToReplace = str.charAt(charnum);

            inarr[i] = str.replace(charToReplace, (char)(97 + replacewith));

        }

        
        String res = check(inarr);
        sc.close();

        System.out.println(res);


    }
}
