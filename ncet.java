import java.util.Scanner;

public class ncet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] v = new int[n + 1];
        int[][] p = new int[q][3];

        for (int i = 0; i < q; i++) {
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();
            p[i][2] = sc.nextInt();
            p[i][0]--;
            p[i][1]--;
        }

        for (int i = 0; i < q; i++) {
            int idx1 = p[i][0];
            int idx2 = p[i][1];
            int val = p[i][2];

            v[idx1] += val;
            v[idx2 + 1] += -1 * val;

        }

        int maxi = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            v[i] = v[i] + v[i - 1];
            maxi = Math.max(v[i], maxi);
        }
        System.out.println(maxi);
        sc.close();
    }
}
