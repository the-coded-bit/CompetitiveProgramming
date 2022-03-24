/**
 * countandsay
 */
public class countandsay {
    private static String count(String s){
        
        s += " ";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
            }
            else{
                sb.append(Integer.toString(count) + s.charAt(i));
                count = 1;
            }
        }
        return sb.toString();
    }

    private static String say(int n){
        if(n == 1) return "1";
        String init = "1";
        for(int i = 1; i <= n; i++){
            String ans = count(init);
            init = ans;
        }
        return init;
    }
    
    public static void main(String[] args) {
        int n = 4;
        System.out.println(say(n));
    }
}