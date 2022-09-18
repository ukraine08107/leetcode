package medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height  = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }




    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while (l!=r){
            if(height[l]>height[r]){
                max = Math.max(max,height[r]*(r-l));
                r--;
            }else if(height[l]<height[r] ||height[l]==height[r]){
                max = Math.max(max,height[l]*(r-l));
                l++;
            }
        }
        return max;
    }
}