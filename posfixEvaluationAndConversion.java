import java.util.Stack;


public class posfixEvaluationAndConversion {

    public static int solvePostfix(String exp){
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = st.pop();
                int v1 = st.pop();
                int val = operation(v1, v2, ch);
                st.push(val);
            } else{
                st.push(ch - '0');
            }
        }
        return st.pop();
    }
   

    public static int operation (int v1, int v2, char op) {  

        if (op == '+') {
          return v1 + v2;
        } else if (op == '-') {
          return v1 - v2;
        } else if (op == '*') {
          return v1 * v2;
        } else {
          return v1 / v2;
        }

      }
      public static String solveInfix(String exp){
        Stack<String> st = new Stack<>();
        
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
               String v2 = st.pop();
               String v1 = st.pop();
               String val = '(' + v1 + ch + v2 + ')';
               st.push(val);
            } 
            else{
                st.push(ch + "");
            }
        }
        return st.pop();
    }
    
    public static String solvePrefix(String exp){
        Stack<String> st = new Stack<>();
        
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
               String v2 = st.pop();
               String v1 = st.pop();
               String val = ch + v1 + v2;
               st.push(val);
            } 
            else{
                st.push(ch + "");
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
    String exp = "264*8/+3-";
    System.out.println(solvePostfix(exp));
    System.out.println(solveInfix(exp));
    System.out.println(solvePrefix(exp));

}
}