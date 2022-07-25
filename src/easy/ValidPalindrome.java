package easy;

public class ValidPalindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0; i<s.length();i++){
            if((Character.toLowerCase(s.charAt(i))>='a' && Character.toLowerCase(s.charAt(i))<='z') || s.charAt(i)>='0' && s.charAt(i)<='9' ){
                stringBuilder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        for(int i = 0; i<stringBuilder.length()/2;i++){
            if(stringBuilder.charAt(i) != stringBuilder.charAt(stringBuilder.length()-1-i)){
                return false;
            }


        }
        return true;
    }
}
