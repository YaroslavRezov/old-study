import java.util.ArrayList;

public class LastJava46 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");
        ArrayList<String> arrayList1 = arrayList;
        while (!arrayList.isEmpty()){
            arrayList1.remove("a");
        }
        System.out.println(arrayList1);
    }
}
