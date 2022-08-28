package easy;

public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int []{1,7,3,6,5,6}));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int left_sum = 0;
        for(int i:nums){
            sum +=i;
        }
        for(int i = 0; i<nums.length;i++){
            if(left_sum==sum-left_sum-nums[i]){
                return i;
            }
            left_sum +=nums[i];
        }
        return -1;
    }
}