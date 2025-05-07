import java.util.ArrayList;
import java.util.List;

public class JavaFuck24 {
    public static void main(String[] args) throws Exception {
        List list = new ArrayList();
        list.add("val1"); //1
         //2
        list.add(1, "val3"); //3
        System.out.println(list);
        Legend legend = new Legend() {
            @Override
            public void kill() {

            }

            @Override
            public void loot() {

            }
        };
    }
}
