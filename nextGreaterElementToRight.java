import java.io.*;
import java.util.*;

public class nextGreaterElementToRight{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   int[] ans = new int[arr.length];
   Stack<Integer> st = new Stack<>();
   for(int i = 0; i < arr.length; i++) ans[i] = 0;
   
   st.push(arr[arr.length - 1]);
   ans[arr.length - 1] = -1;
   for(int i = arr.length - 1; i >= 0; i--){
       int val = arr[i];
       while(st.size() > 0 && st.peek() <= val){
           st.pop();
       }
       if(st.empty() == true){
           ans[i] = -1;
       }
       else{
           ans[i] = st.peek();
       }
       st.push(arr[i]);
       
   }
   return ans;
 }

}