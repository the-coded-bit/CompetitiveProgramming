
public class dished {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 2, 1, 1, 1, 1};
        int maxi = 0, type = 0;

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    j++;
                    count++;
                }
            }
            if(count > maxi){
                maxi = count;
                type = arr[i];
            }
            else if(count == maxi){
                type = Math.min(type, arr[i]);
            }
        }
        System.out.println(type);
    }
}
