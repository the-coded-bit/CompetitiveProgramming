import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class trainTrack {

    static class TrainInfo implements Comparable<TrainInfo>{
        int trainNo;
        int start;
        int end;
        int platformNo;

        TrainInfo(int trainNo, int start, int end){
            this.trainNo = trainNo;
            this.start = start;
            this.end = start + end;
            platformNo = 0;
        }

        @Override
        public int compareTo(TrainInfo o) {
            if(this.start == o.start){
                return this.trainNo - o.trainNo;
            }
            
            return this.start - o.start;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<TrainInfo> list = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            int trainno = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();

            list.add(new TrainInfo(trainno, start, end));
        }

        int tofind = sc.nextInt();
        sc.close();
        Collections.sort(list);
        //printing the sorted list
        for(int i = 0; i < n; i++){
            TrainInfo info = list.get(i);
            System.out.println(info.trainNo + "     " + info.start + "      " + info.end + "        " + info.platformNo);
        }
        TrainInfo prev = list.get(0);
        prev.platformNo = 1;
        TrainInfo miniTrain = prev;

        for(int i = 1; i < n; i++){
            TrainInfo curr = list.get(i);
            if(curr.start <= miniTrain.end){
                curr.platformNo = i + 1;
            }
            else if(curr.start > miniTrain.end){
                curr.platformNo = miniTrain.platformNo;
            }

            if(curr.end < miniTrain.end){
                miniTrain = curr;
            }
        }
        System.out.println("---------------------");
        for(int i = 0; i < n; i++){
            TrainInfo info = list.get(i);
            System.out.println(info.trainNo + "     " + info.start + "      " + info.end + "        " + info.platformNo);
        }

        for(int i = 0; i < n; i++){
            TrainInfo curr = list.get(i);
            if(curr.trainNo == tofind){
                System.out.println(curr.platformNo);
                break;
            }
        }

        int[] freq = new int[n];
        for(int i = 0; i < n; i++){
            TrainInfo info = list.get(i);
            freq[info.platformNo - 1]++;
        }

        int maxi = 0;
        for(int i = 0; i < n; i++){
           maxi = Math.max(maxi, freq[i]);
        }

        for(int i = 0; i < n; i++){
            if(freq[i] == maxi){
                System.out.println(i + 1);
                break;
            }
        }


    }
}
