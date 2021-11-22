import java.io.*;
import java.util.*;


public class mergeIntervals {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time

        //first sort the array according to end times
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                return Integer.compare(a[1], b[1]);       
            }
        });

        System.out.println("------------------");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " " );
            System.out.println();    
        }

        System.out.println("------------------");
        //now push initialtEle = arr[i] initially where i = 0
        // then start the loop from i = 1 to arr.length
        //then start comparing end time of initialEle[1] with arr[i + 1][0] 
        //if  initialEle[1] > current[0] then pop initialEle and push [min(initialtEle[0], current[0]), max(initialEle[1], current[1])]
        Stack<int[]> st = new Stack<>();
        int[] initialEle = st.push(arr[0]);

        // System.out.println(st.peek()[1]);

        for(int i = 1; i < arr.length; i++){
            int[] current = arr[i];
            if(initialEle[1] >= current[0]){
                st.pop();
                int[] newarr = {Integer.min(initialEle[0], current[0]), Integer.max(initialEle[1], current[1])};
                initialEle = newarr;
                st.push(newarr);
            }
            else{
                st.push(current);
                initialEle = current;
            }
        }

        //new stack just for sake of printing purposes
        Stack<int[]> nst = new Stack<>();
        while(st.size() > 0){
            int[] ele = st.pop();
            nst.push(ele);
        }

        //printing
        while(nst.size() > 0){
            int[] a = nst.pop();
            System.out.println(a[0] + " " + a[1]);
        }
    }

}