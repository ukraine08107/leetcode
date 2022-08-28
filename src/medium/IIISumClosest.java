package medium;

public class IIISumClosest {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));
        System.out.println(threeSumClosest(new int[]{0,0,0},1));
    }


    class Solution {
        public int removeDuplicates(int[] nums) {
            int index = 1;
            for(int i = 0; i<nums.length -1; i++){
                if(nums[i]!=nums[i+1]){
                    nums[index] = nums[i+1];
                    index++;
                }
            }
            return index;
        }
    }



    public static int threeSumClosest(int[] nums, int target) {
        int counter = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length;i++){
            if(i>=3){
                counter++;
                if(Math.abs(target-sum) < Math.abs(result)){
                    result =Math.min(sum,result);
                }
                sum -=nums[counter];
            }else if(i<3){
                sum+=nums[i];
            }
            result = Math.min(sum,result);
            }
        return  Math.min(sum,result);
    }
}
