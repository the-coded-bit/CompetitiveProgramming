import java.util.Stack;

public class balancedBrackets {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
                System.out.println(st);
            }
            else if(ch == ')'){
               if(st.size() == 0){
                   return false;
               } 
                else if(st.peek() != '('){
                   return false;
               }
                else{
                 st.pop();   
                }
            }
            else if(ch == ']'){
                if(st.size() == 0){
                   return false;
               } 
                else if(st.peek() != '['){
                   return false;
               }
                else{
                 st.pop();  
                }
            }
            else if(ch == '}'){
                if(st.size() == 0){
                   return false;
               } 
                else if(st.peek() != '{'){
                   return false;
               }
                else{
                 st.pop();   
                }
            }
        }
        if(st.size() == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));
    }
}
