import java.util.ArrayList;
import java.util.List;

public class JavaFail88 {
    static int i = 1;
    static int y = i++;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(y);
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        System.out.println(s1.remove("a")+" "+s1.remove("x"));
        System.out.println(s1);

    }
}
