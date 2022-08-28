package medium;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
//        System.out.println(findUnsortedSubarray(new int[]{2,6,4,8,10,9,15}));
//        System.out.println(findUnsortedSubarray(new int[]{1,2,3,4}));
//        System.out.println(findUnsortedSubarray(new int[]{1}));
//        System.out.println(findUnsortedSubarray(new int[]{1,3,2,2,2}));
//        System.out.println(findUnsortedSubarray(new int[]{5,4,3,2,1}));
      System.out.println(findUnsortedSubarray(new int[]{1,2,4,5,3}));
      StringBuilder builder = new StringBuilder();
        for (int i = 0; i <builder.length() ; i++) {

        }
    }


    public static int findUnsortedSubarray1(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                min = Math.min(min, nums[i]);

            }
        }
        for(int i = nums.length-1;i>=1;i--){
            if(nums[i]<nums[i-1]){
                max = Math.max(max,nums[i]);

            }
        }
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==min){
                min = i;
                break;
            }
        }
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            return 0;
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i]==max){
                max = i;
                break;
            }
        }
return max-min+1;
    }

    public static int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])

                flag = true;
            if (flag)
                min = Math.min(min, nums[i]);
        }
        flag = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1])
                flag = true;
            if (flag)
                max = Math.max(max, nums[i]);
        }
        int l, r;
        for (l = 0; l < nums.length; l++) {
            if (min < nums[l])
                break;
        }
        for (r = nums.length - 1; r >= 0; r--) {
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;
    }




}
