import java.util.ArrayList;
import java.util.List;

public class JavaFuck31 {
    int i = 5;
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<String>();
        String s = "shit";
        s1.add("a");
        s1.add(s); //1
        s1.add("b");
        s1.remove("ss|"); //2
        s1.removeAll(s1);
        System.out.println(s1); //3

    }
}
