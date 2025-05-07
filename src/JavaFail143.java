import java.util.ArrayList;

public class JavaFail143 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        String s[] = new String[1];
        probe("");
    }
   static void probe(String... x) { System.out.println(x); }
}
