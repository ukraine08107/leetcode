package easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] s1 = {1,1,2};
        int [] s2 = {0,0,1,1,1,2,2,3,3,4};

      //  System.out.println(removeDuplicates(s1));
        System.out.println(removeDuplicates(s2));
    }
    public static int removeDuplicates(int[] nums) {
       int index = 1;
        for (int i = 0; i <nums.length-1; i++) {
            if (nums[i]!=nums[i+1]){
                nums[index] = nums[i+1];
                index++;
            }
        }
        return index;
    }



}
