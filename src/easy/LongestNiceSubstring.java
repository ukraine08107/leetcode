package easy;

import java.util.Locale;

public class LongestNiceSubstring {
    public static void main(String[] args) {
//        System.out.println(longestNiceSubstring("YazaAay"));
//        System.out.println(longestNiceSubstring("Bb"));
     //   System.out.println(longestNiceSubstring("dDzeE"));
        System.out.println(longestNiceSubstring("jcJ"));
    }


    public static String longestNiceSubstring(String s) {
        StringBuffer buffer = new StringBuffer();
        int index = 0;
        int end = 0;
        if (s.length()<=1){
            return buffer.toString();
        }
        for (int i = 1; i <s.length() ; i++) {
            if (Character.toLowerCase(s.charAt(index)) ==Character.toLowerCase(s.charAt(i))){
                buffer.append(s.charAt(index));
                index++;
                end = i;
            } else {
                index++;
                if (buffer.length()!=0){
                    break;
                }
            }
        }if (buffer.length()!=0){
            buffer.append(s.charAt(end));
        }
return buffer.toString();
    }
    }
