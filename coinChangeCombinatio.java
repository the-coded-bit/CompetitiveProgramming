class Main{

    public static int coinChangeRecursive(int[] a, int n, int target){
        //base Condition
        if(target < 0) return 0;
        if(target == 0) return 1;
        else if(n == 0) return 0;

        int acc = coinChangeRecursive(a, n, target - a[n - 1]);
        int nacc = coinChangeRecursive(a, n - 1, target);
        int ans = acc + nacc;
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2,  3};
        System.out.println(coinChangeRecursive(a, 3, 4));
    }
}