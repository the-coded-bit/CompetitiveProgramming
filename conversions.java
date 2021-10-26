import java.io.*;
import java.util.*;

public class conversions{
    
    public static String prefixExpression(String v1, String v2, char operator){
        return operator + v1 + v2;
    } 
    public static String postfixExpression(String v1, String v2, char operator){
        return v1 + v2 + operator;
    }
    
    public static int precedence(char operator){
        if(operator == '+'){
            return 1;
        } else if(operator == '-'){
            return 1;
        } else if(operator == '*'){
            return 2;
        } else if(operator == '/'){
            return 2;
        }
        return 0;
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<String> prefix = new Stack<>();
    Stack<String> postfix = new Stack<>();
    Stack<Character> operator = new Stack<>();
    
    for(int i = 0; i < exp.length(); i++){
        char ch = exp.charAt(i);
        
        if(ch == '('){
            operator.push(ch);
        }
        else if(ch == ')') {
            while(operator.peek() != '('){
                char optr = operator.pop();
                
                String v2fpre = prefix.pop();
                String v1fpre = prefix.pop();
                
                String resultpre = prefixExpression(v1fpre, v2fpre, optr);
                prefix.push(resultpre);
                
                String v2fpost = postfix.pop();
                String v1fpost = postfix.pop();
                
                String resultpost = postfixExpression(v1fpost, v2fpost, optr);
                postfix.push(resultpost);
                
            }
            operator.pop();
        }
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            while(operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())){
                char optr = operator.pop();
                
                String v2fpre = prefix.pop();
                String v1fpre = prefix.pop();
                
                String resultpre = prefixExpression(v1fpre, v2fpre, optr);
                prefix.push(resultpre);
                
                String v2fpost = postfix.pop();
                String v1fpost = postfix.pop();
                
                String resultpost = postfixExpression(v1fpost, v2fpost, optr);
                postfix.push(resultpost);
            }
            operator.push(ch);
        }
        else{
            prefix.push(ch + "");
            postfix.push(ch + "");
        }
    }
    
    while(operator.size() != 0){
                char optr = operator.pop();
                
                String v2fpre = prefix.pop();
                String v1fpre = prefix.pop();
                
                String resultpre = prefixExpression(v1fpre, v2fpre, optr);
                prefix.push(resultpre);
                
                String v2fpost = postfix.pop();
                String v1fpost = postfix.pop();
                
                String resultpost = postfixExpression(v1fpost, v2fpost, optr);
                postfix.push(resultpost);
    }
    System.out.println(postfix.peek());
    System.out.println(prefix.peek());
 }
}