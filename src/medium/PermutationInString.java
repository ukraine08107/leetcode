package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PermutationInString {
    public static void main(String[] args) {
         String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
    int counter = 0;
    boolean result = false;
        Set<Character> set = new HashSet<>();

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <s1.length() ; i++) {
            list.add(s1.charAt(i));
        }
        for (int i = 0; i <s2.length() ; i++) {
            if (list.contains(s2.charAt(i))){
                counter++;
                list.remove(s2.charAt(i));
                result = true;
            }
        }
             
            return false;
        
    }

}
