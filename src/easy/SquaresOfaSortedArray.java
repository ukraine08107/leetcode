package easy;

import java.util.Arrays;

public class SquaresOfaSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {-4,-1,0,3,10};
        int [] arr2 = {-7,-3,2,3,11};
        int [] arr3 = {};


        System.out.println(Arrays.toString(sortedSquares1(arr1)));
        System.out.println(Arrays.toString(sortedSquares1(arr2)));
        System.out.println(Arrays.toString(sortedSquares1(arr3)));
    }

    public static int[] sortedSquares1(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int pointer = nums.length-1;
        int [] result = new int[nums.length];
        while (left<=right){
            if (Math.abs(nums[left])>Math.abs(nums[right])){
                result[pointer] = nums[left]*nums[left];
                left++;
            }else {
                result[pointer] = nums[right] * nums[right];
            right--;
            }
            pointer--;
        }
        return result;
    }




    public static int[] sortedSquares(int[] nums) {
        int [] result = new int [nums.length];
        int counter = 0;
        int index = 0;
        boolean isSorted = false;
        for (int i = 0; i <nums.length ; i++) {
            result[i] = nums[i] * nums[i];
        }
        while (!isSorted){
            for (int i = 1; i <result.length ; i++) {
                if (result[index]>result[i]){
                    int temp = result[index];
                    result[index] = result[i];
                    result[i] = temp;
                    index++;
                    counter++;
                }else {
                    index++;
                }

            }

            if (counter ==0){
                isSorted = true;
            }
            index = 0;
            counter = 0;
        }
return result;
    }
}