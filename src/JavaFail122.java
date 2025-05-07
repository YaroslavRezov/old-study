import java.util.ArrayList;
import java.util.List;

public class JavaFail122 {
    final String g = "cock";
//    g = ";";

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();
        arrayList.add("s");
        arrayList.add("w");
        for(final String s : arrayList){
            System.out.println(s);
        }
    }
}
