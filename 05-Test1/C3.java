
public class C3 {
    public String t;

    public static boolean isAlphabet(String t) {
        if (t == null || t.length() <= 1) {
            return true;  
        }
        t = t.toLowerCase();

        for (int i = 0; i < t.length() - 1; i++) {
            if (t.charAt(i) > t.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static String hideText(String t){
        if(t.length()<=2){
            return t;
        }
        String a=t.substring(0, 1);
        String b=t.substring(t.length()-1,t.length());
        return a+"*".repeat(t.length()-2)+b;
    }
}