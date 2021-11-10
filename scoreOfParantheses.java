import java.util.Stack;
public class scoreOfParantheses {
    public static int score(String s){

        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(-1);
            } 
            else{
                if(st.peek() == -1){
                    st.pop();
                    st.push(1);
                }
                else{
                    while(st.size() > 0 && st.peek() != -1){
                        ans += st.pop();
                    }
                    st.pop();
                    st.push(2 * ans);
                    ans = 0;
                }
            }
        }
        int val = 0;
        while(st.size() > 0){
            val += st.pop();
        }
        return val;
            
    }

    public static void main(String[] args) {
        String str = "()()";
        System.out.println(score(str));
    }
}
