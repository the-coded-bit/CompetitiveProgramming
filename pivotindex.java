public class pivotindex {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int[] suffix = new int[arr.length + 1];
        suffix[arr.length] = 0;
        suffix[arr.length - 1] = arr[arr.length - 1];

        for(int i = arr.length -2; i >= 0; i--) suffix[i] = suffix[i + 1] + arr[i];

        int sum = 0, ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(sum == suffix[i + 1]) ans = i;
            sum += arr[i];
        }

        System.out.println(ans);
    }
}
