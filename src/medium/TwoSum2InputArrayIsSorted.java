package medium;

import java.util.Arrays;

public class TwoSum2InputArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1,0},-1)));
        System.out.println(Arrays.toString(twoSum(new int[]{-3,3,4,90},0)));
        System.out.println(Arrays.toString(twoSum(new int[]{        12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,
                                                                    168,173,173,180,199,212,221,227,230,277,282,306,314,316,
                                                                    321,325,328,336,337,363,365,368,370,370,371,375,384,387,
                                                                    394,400,404,414,422,422,427,430,435,457,493,506,527,531,
                                                                    538,541,546,568,583,585,587,650,652,677,691,730,737,740,
                                                                    751,755,764,778,783,785,789,794,803,809,815,847,858,863,
                                                                    863,874,887,896,916,920,926,927,930,933,957,981,997
        },542)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int [] result = new int[2];
        int begin = 0;
        int end = numbers.length-1;
        int sum = 0;
        while (begin!=end){
            sum = numbers[begin] + numbers[end];
            if(sum==target){
                result = new int[] {begin+1,end+1};
                return result;
            }else if(sum>target){
                end--;
            }else if(sum < target){
                begin++;
            }
        }
        return result;
    }

}
