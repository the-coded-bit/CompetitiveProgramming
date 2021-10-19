import java.io.*;
import java.util.*;

public class LargestAreaHistogram{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nsetr = nextElementToRight(a);
    int[] nsetl = nextElementToLeft(a);

    int maxi = Integer.MIN_VALUE;
    for(int i = 0; i < a.length; i++){
        int val = nsetr[i] - nsetl[i] - 1;
        maxi = Math.max(maxi, a[i] * val);
    }
    System.out.println(maxi);
 }
 
 public static int[] nextElementToRight(int[] arr){
    int[] ans = new int[arr.length];
    ans[arr.length - 1] = arr.length - 1;
    Stack<Integer> st = new Stack<>();
    st.push(arr.length - 1);
    
    for(int i = arr.length - 2; i >= 0; i--){
        while(st.size() > 0 && arr[st.peek()] >= arr[i]){
            st.pop();
        }
        if(st.empty() == true){
            ans[i] = arr.length;
        }
        else{
            ans[i] = st.peek();
        }
        st.push(i);
    }
    
    return ans;
 }

 public static int[] nextElementToLeft(int[] arr){
     int[] ans = new int[arr.length];
     Stack<Integer> st = new Stack<>();
     st.push(0);
     ans[0] = 0;
     for(int i = 1; i < arr.length; i++){
        while(st.size() > 0 && arr[st.peek()] >= arr[i]){
            st.pop();
        }
        if(st.empty() == true){
            ans[i] = -1;
        }
        else{
            ans[i] = st.peek();
        }
        st.push(i);
     }
     return ans;
 }
}