import java.util.ArrayList;
import java.util.List;

public class JavaFail96 {
    int j = j1;               //LINE 11
    static int j1 = 0;
    public static void main(String[] args) throws Exception {
        int j1 = (int) x;
//        Integer i = Integer.parseInt(args[0]);
//        Integer j = i;
//        i--;
//        i++;
//        System.out.println((i==j));
        List<String> s1 = new ArrayList<String>();
        String s = null;
        s1.add("a");
        s1.add(s); //1
        s1.add("b");
        s1.add(s);
        s1.remove(s); //2
        System.out.println(s1); //3
        int k;
    }
    static double x;

}
