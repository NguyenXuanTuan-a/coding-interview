import java.util.Locale;

public class Main {

    public static Boolean isPangram (String s) {
        if(s.length() <26) {
            return false;
        } else {
            for(char ch = 'a' ; ch <= 'z' ;ch++){
                if (s.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Kiểm tra chuỗi đã cho có phải pangram ( từ a -> z)
        String s = "1234444444444444444444444444444444444444444";

        System.out.println(isPangram(s.toLowerCase()));

    }


}