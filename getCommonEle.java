import java.util.HashMap;

public class getCommonEle {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2, 3, 5};
        int[] arr2 = {1, 1, 1, 2, 2, 4, 5};

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            if(mp.containsKey(arr1[i])){
                mp.put(arr1[i], mp.get(arr1[i] + 1));
            }
            else
                mp.put(arr1[i], 1);
        }

        for(int i = 0; i < arr2.length; i++){
            if(mp.containsKey(arr2[i])){
                System.out.println(arr2[i]);
                mp.remove(arr2[i]);
            }
        }
    }
}
