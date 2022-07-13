package easy;

public class FindMaximumSumOfASubarrayOfSizeK {
    public static void main(String[] args) {
        // int [] arr = {100, 200, 300, 400};
        // int k = 2;
        // int [] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        // int k = 4;
        int [] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maximumOfSubaray(arr,k));
    }
    public static int maximumOfSubaray(int[] arr, int k){
        if (k > arr.length || k<0){
            return -1;
        }
        int result = 0;
        for (int i = 0; i <arr.length-k+1; i++) {
            int temp = 0;
            for (int j = 0; j <k ; j++) {
                temp += arr[i+j];
            }
            if (result<temp){
                result = temp;
            }
        }
        return result;
    }


}

