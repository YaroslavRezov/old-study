import java.util.ArrayList;
import java.util.List;

public class JavaFail7 {
    public static void main(String[] args) {
        ClassCastBullshitSub s = new ClassCastBullshitSub();
        ClassCastBullshitSub s1 = (ClassCastBullshitSub) new ClassCastBullshitSuper();
        List arrayList = new ArrayList();
        int i = 0;
        int j = 1;
        if (i++ == 0) {
            i = 12;
        }
        System.out.println(i+" "+j);
//        int[] array = new int[0];
//        array[0] = 4;


    }
}
