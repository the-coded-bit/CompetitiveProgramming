
public class longestCommonSubstring{


    public static int lcsRecursive(String a, String b, int result){

        //base condition
        if(a.length() == 0 || b.length() == 0)
            return result;      

        int lia = a.length() - 1;
        int lib = b.length() - 1;
        if(a.charAt(lia) == b.charAt(lib)){
            result = lcsRecursive(a.substring(0, lia), b.substring(0, lib), result + 1);
        }
        int lessina = lcsRecursive(a.substring(0, lia), b, 0);
        int lessinb = lcsRecursive(a, b.substring(0, lib), 0);
        result = Math.max(result ,Math.max(lessina, lessinb));

        return result;
    }

    
    public static void main(String[] args) {
        String a = "hello";
        String b = "codeforces";

        System.out.println(lcsRecursive(a,b, 0));
    }
}