package easy;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int [] arr1= {1,12,-5,-6,50,3};
        int k1 = 4;
        int [] arr2 = {5};
        int k2 = 1;
        int [] arr3 = {-1};
        int k3 = 1;
        int [] arr4= {3,3,4,3,0};
        int k4 = 3;





        System.out.println(findMaxAverage(arr1,k1));
        System.out.println(findMaxAverage(arr2,k2));
        System.out.println(findMaxAverage(arr3,k3));
        System.out.println(findMaxAverage(arr4,k4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
        int pointer = 0;
        for (int i = 0; i <nums.length-k+1; i++) {
            int sum = 0;
            while (pointer!=k){
                sum += nums[i+pointer];
                pointer++;
            }
            pointer = 0;
            if (sum>result){
                result = sum;
            }
        }
    return result/k;
    }


}
