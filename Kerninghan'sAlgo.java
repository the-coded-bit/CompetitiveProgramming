import java.util.*;

class Kerninghan {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.close();
    //write your code here
    // Kerninghan's Algorithm 
    int count = 0;
    while(n != 0){
        int rmsb_mask = n & (-1 * n);
        n -= rmsb_mask;
        count++;
    }
    
    System.out.println(count);
  }

}