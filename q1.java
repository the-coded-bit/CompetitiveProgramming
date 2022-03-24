import java.util.*;
public class q1 {

    static final int ASCII_SIZE = 256;
    static int  getMaxOccuringCharCount(String str)
    {
        
        int count[] = new int[ASCII_SIZE];
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1;  
        char result = ' ';   
    
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        int res = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == result) res++;
        }

        return res;
        
    }

    public static ArrayList<String> SubStr(String str, int n)
    {
        ArrayList<String> list = new ArrayList<>();
       for (int i = 0; i < n; i++)
           for (int j = i+1; j <= n; j++)
                list.add(str.substring(i, j));

        return list;        
    }
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] inarr = s.split(",");

        int inum1 = sc.nextInt();
        int inum2 = sc.nextInt();

        int[] freq = new int[inarr.length];

        for(int i = 0; i < inarr.length; i++){
            String str = inarr[i];
            freq[i] = getMaxOccuringCharCount(str);
        }

        String outstr = "";
        for(int i = 1; i < freq.length; i++){
            int modular = inarr[i].length() % freq[i - 1];
            char cc = inarr[i].charAt(modular);
            outstr += cc;
        }


        ArrayList<String> list = SubStr(outstr, outstr.length());
        int res = 0;
        for(int i = 0; i < list.size(); i++){
            String ss = list.get(i);
            if(ss.length() >= inum1 && ss.length() <= inum2){
                res++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
