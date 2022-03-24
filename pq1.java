import java.util.*;

public class pq1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(arr[0]);
        int maxi = n;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= maxi && pq.peek() != maxi) pq.add(arr[i]);
            else{
                while(pq.size() > 0 && pq.peek() == maxi){
                    maxi--;
                    System.out.print(pq.remove() + " ");
                }
                pq.add(arr[i]);
                System.out.println();
            }
        }
        
        while(pq.size() > 0){
            System.out.print(pq.remove() + " ");
        }
    }
}
