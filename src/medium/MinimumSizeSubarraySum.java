package medium;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int [] arr1 = {2,3,1,2,4,3};
        int target1 = 7;
        int [] arr2 = {1,4,4};
        int target2 = 4;
        int [] arr3 = {1,1,1,1,1,1,1,1};
        int target3 = 11;
        int [] arr4 = {1,2,3,4,5};
        int target4 = 11;
        System.out.println(minSubArrayLen(arr1,target1));
        System.out.println(minSubArrayLen(arr2,target2));
        System.out.println(minSubArrayLen(arr3,target3));
        System.out.println(minSubArrayLen(arr4,target4));   
    }
    public static int minSubArrayLen(int[] nums,int target) {
    int begin = 0;
    int end = 0;
    int counter = 0;
    int sum = 0;
    int result = Integer.MAX_VALUE;
    boolean temp = false;
       while (!temp){
           if (end==nums.length && sum<target){
               if (counter ==0){
                   return 0;
               }
               return result;
           }
           if (sum<target){
               sum +=nums[end];
               end++;
           }else if (sum>=target){
               counter = end-begin;
               result = Math.min(result,counter);
               sum -=nums[begin];
               begin++;
           }
       }
        return result;
                }
}
