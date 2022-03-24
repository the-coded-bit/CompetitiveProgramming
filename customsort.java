import java.util.*;

public class customsort {
    static class Scores{
        int idx, a, b, score;
        Scores(){}
        Scores(int idx, int a, int b, int score){
            this.idx = idx;
            this.a = a;
            this.b = b;
            this.score = score;
        }
    }
    public static int solve(int N, List<Integer> A, List<Integer> B){
        List<Scores> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(new Scores(i, A.get(i), B.get(i), A.get(i) * B.get(i)));
        }

        Collections.sort(list, (a, b) ->{
            if(a.score > b.score) return b.score - a.score;
            else if(a.score == b.score){
                if(a.b > b.b) return b.b - a.b;
                else if(a.b == b.b){
                    if(a.idx > b.idx) return b.idx - a.idx;
                }
            }
            return b.score - a.score;
        });

        for(int i = 0; i < N; i++){
            Scores curr = list.get(i);
            System.out.println("score = " + curr.score + " b = " + curr.b + " a = " + curr.a + " idx = " + curr.idx);
        }

        int ans = list.get(2).idx;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            A.add(num);
        }

        List<Integer> B = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            B.add(num);
        }
        sc.close();
        System.out.println(solve(n, A, B));

    }
}
