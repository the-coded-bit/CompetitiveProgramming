/**
     * test
     */
    public class test {
        static int binarySearch(int[] a, int key, int n) {
            int high = 0,pos = -1;
            int end = n-1;
            while (high <= end) {
                int mid = (high + end)/2;
                if(a[mid] == key) {
                    pos = mid;
                    break;
                }
                if(a[mid] < key)
                  high = mid + 1;
                else if(a[mid] > key)
                   end = mid - 1;
            }
            return pos;
        }
        public static void main(String[] args) {
            int[] arr = {2,5,8,12,16,23,38,56,72,91};
            int k = 5;
            System.out.println(binarySearch(arr, k, 10));
        }
    }