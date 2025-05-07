import java.io.Console;
import java.util.ArrayList;
import java.util.Objects;

public class SynergyJava8 {
    public static void main(String[] args) {
        String s = "hbruh";
        String ss = "";
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        ArrayList<String> s3 = new ArrayList<>();
//
        for(int i = 0; i <s.length(); i++) {
            s1.add(String.valueOf(s.charAt(i)));
        }
        int c = 1;
        for (int i = 0; i < s1.size(); i++) {
            for (int j = i; j < s1.size() - 1 ; j++) {
                if(s1.get(i) == s1.get(j)) {
                    c = c +1;
                }
            }

        }
        System.out.println(c);
    }
}
