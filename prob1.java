import java.util.Arrays;
import java.util.Collections;
// import java.util.Collections;
// import java.util.PriorityQueue;
import java.util.PriorityQueue;

public class prob1 {
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 9};
        int n = 4, k = 1;
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());

       int mini = 0, maxi = 0;
       for(int i = 0; i < n; i++){
           pq.add(arr[i]);
           pq1.add(arr[i]);
           mini = Math.min(arr[i], mini);
           maxi = Math.max(arr[i], maxi);
       }

       while(k > 0){
           pq.remove();
           pq1.remove();
           k--;
       }
       int ans = Math.min(pq.peek() - maxi, pq1.peek() - mini);
       System.out.println(ans);
    }
}
