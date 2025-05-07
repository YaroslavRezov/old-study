import java.util.ArrayList;

public class Tevirp {
    public static void main(String[] args) {
        Tevirp tevirp = new Tevirp();
        tevirp.revers("Пртвет");
        System.out.println(tevirp.revers("Привет"));

    }
    public ArrayList<Character> revers(String x) {

        ArrayList<Character> hu = new ArrayList<>();
        for (int i = x.length(); i > 0; i--) {
            char c = x.charAt(i-1);
            hu.add(c);
         }

        return hu;
    }

}
