import java.util.*;

public class allrepeatingexceptone {
    
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    scn.close();
    //write your code here
    int ans = 0;
    for(int i = 0; i < n; i++){
        ans = ans ^ arr[i];
    }
    System.out.println(ans);
  }

}
