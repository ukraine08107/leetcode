package medium;

import java.util.HashSet;
import java.util.TreeSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("abcabcbb"));
        System.out.println(lengthOfLongestSubstring1("bbbbb"));
        System.out.println(lengthOfLongestSubstring1("pwwkew"));
        System.out.println(lengthOfLongestSubstring1(" "));
        System.out.println(lengthOfLongestSubstring1("cdd"));
        System.out.println(lengthOfLongestSubstring1("qrsvbspk"));
        System.out.println(lengthOfLongestSubstring1("abba"));
                System.out.println(lengthOfLongestSubstring1("aab"));
    }


    public static int lengthOfLongestSubstring(String s) {
        int unique = 0;
        int result = 0;
        TreeSet<Character> set  = new TreeSet<>();
        for (int i = 0; i <s.length() ; i++) {
            if (!set.contains(s.charAt(i))){
                unique++;
                set.add(s.charAt(i));
            }else {
                set.clear();
                i -=unique;
               result =  Math.max(unique,result);
               unique = 0;
            }
        }
        result =  Math.max(unique,result);
        return result;
    }




    public static int lengthOfLongestSubstring1(String s){
        int begin = 0;
        int end = 0;
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i <s.length() ; i++) {
            if (set.contains(s.charAt(i))){
                result = Math.max(result,end-begin);
                set.remove(s.charAt(begin));
                begin++;
                i--;
            }else {
                set.add(s.charAt(i));
                    end++;
            }
        }
 result = Math.max(result,end-begin);
return result;


//
//    HashMap<Character,Integer> map  = new HashMap<>();
//    int counter = 0;
//    int result = 0;
//        for (int i = 0; i <s.length() ; i++) {
//            if (!map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),i);
//                counter++;
//            }else {
//                result = Math.max(result,counter);
//                counter = i - map.get(s.charAt(i));
//               map.put(s.charAt(i),i);
//            }
//        }
//        result = Math.max(result,counter);
//        return result;

    }







}
