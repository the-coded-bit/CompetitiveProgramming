import java.io.*;
import java.util.*;

public class slidingWindow{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    //next greater element to the right 
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[a.length];
    ans[a.length - 1] = a.length;
    st.push(a.length - 1);
    
    for(int i = a.length - 2; i >= 0; i--){
        // - a +
        while(st.size() > 0 && a[st.peek()] <= a[i]){
            st.pop();
        }
        if(st.empty() == true){
            ans[i] = a.length;
        }
        else{
            ans[i] = st.peek();
        }
        st.push(i);
    }
    int j = 0;
    for(int i = 0; i < a.length - k + 1; i++){
        if(i > j)
            j = i;
            
        while(ans[j] < i + k){
           j = ans[j]; 
        }
        System.out.println(a[j]);
    }
    
 }
}