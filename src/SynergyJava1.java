import java.util.ArrayList;

public class SynergyJava1 {
    public static void main(String[] args) {
        String shit = "bruh";
        String shit1 = "bruh2";


        ArrayList arrayList = new ArrayList();
        arrayList.add(shit);
        arrayList.add(shit1);
        for (int i = 0; i < arrayList.size(); i++)
        {
            String s = (String) arrayList.get(i);
            System.out.println(s.concat("1"));
        }

    }
}
