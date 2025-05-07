import java.util.ArrayList;

public class CollageJava {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        for (int i = 0; i < arrayList.size(); i++)
        System.out.println(arrayList.get(i));

    }
}
