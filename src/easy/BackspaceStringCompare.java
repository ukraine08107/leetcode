package easy;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
        System.out.println(backspaceCompare("ab##","c#d#"));
    }


        public static boolean backspaceCompare(String s, String t) {
            if(s.length()<1 || t.length() <1){
                return false;
            }
            StringBuilder Sbuilder = new StringBuilder();
            StringBuilder Tbuilder = new StringBuilder();
            for(int i =0; i<s.length();i++){
                if(s.charAt(i)!='#'){
                    Sbuilder.append(s.charAt(i));
                }else if(s.charAt(i)=='#' && Sbuilder.length()!=0){
                    Sbuilder.deleteCharAt(Sbuilder.length()-1);
                }
            }
            for(int i =0; i<t.length();i++){
                if(t.charAt(i)!='#'){
                    Tbuilder.append(t.charAt(i));
                }else if(t.charAt(i)=='#' && Tbuilder.length()!=0){
                    Tbuilder.deleteCharAt(Tbuilder.length()-1);
                }
            }
            return Sbuilder.toString().equals(Tbuilder.toString());
        }
}