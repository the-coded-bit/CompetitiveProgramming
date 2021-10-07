import java.util.Scanner;
import java.util.Stack;

public class duplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        Stack<Character> st = new Stack<>();
        boolean ans = false;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ')'){
                st.push(ch);
            }    
            else{
                if(st.peek() == '('){
                    ans = true;
                    break;
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            }
            System.out.println(ans);
    }
}
