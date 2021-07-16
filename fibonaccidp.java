import java.util.*;

public class fibonaccidp{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    System.out.println(FibonacciMemoized(n, new int[n + 1]));
 }
 //this is the beginning of DP 
 //this question is classical DP problem
 //this problem is solved using memoization technique
 
 public static int FibonacciMemoized(int n, int[] q){
    
    //base case
    if(n == 0 || n == 1)
        return n;
     
    if(q[n] != 0)
        return q[n];
        
    int fmn1 = FibonacciMemoized(n - 1, q);
    int fmn2 = FibonacciMemoized(n - 2, q);
    int fn = fmn1 + fmn2;
    //this is memoization
    // basically placing answers to each question in an array
    q[n] = fn;
    
    return fn;
 }

}