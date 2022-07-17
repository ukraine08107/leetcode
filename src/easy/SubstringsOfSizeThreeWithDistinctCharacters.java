package easy;

import java.util.HashMap;
import java.util.HashSet;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String s1 = "xyzzaz";
        String s2 = "aababcabc";

        System.out.println(countGoodSubstrings(s1));
        System.out.println(countGoodSubstrings(s2));
    }



    public static int countGoodSubstrings(String s) {
        if (s.length()<3){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int counter=0;
        for (int i = 0; i <s.length()-2 ; i++) {
          set.add(s.charAt(i));
          set.add(s.charAt(i+1));
          set.add(s.charAt(i+2));
          if (set.size()==3){
              counter++;
          }
          set.clear();
        }

return counter;
    }
}
