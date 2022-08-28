package medium;

import java.util.HashMap;

public class FruitIntoBaskets {

    public static void main(String[] args) {
        int [] f1 = {1,2,1};
        int [] f2 = {0,1,2,1};
        int [] f3 = {1,2,3,2,2};
        int [] f4 = {1,0,1,2};
        int [] f5 = {0,0,1,1};
        int [] f6 = {3,3,3,1,2,2,2,2,3,3,4};
        System.out.println(totalFruit(f1));
        System.out.println(totalFruit(f2));
        System.out.println(totalFruit(f3));
        System.out.println(totalFruit(f4));
        System.out.println(totalFruit(f5));
        System.out.println(totalFruit(f6));
    }
    public static int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> basket = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            if (basket.containsKey(fruits[i]) && basket.size()<2){

            }
        }





        return 0;
    }
    }
