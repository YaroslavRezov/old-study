import java.util.ArrayList;

public class SynergyJava17 {

    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);

        for(int i = 0; i < 20;) {
            list.add(list.get(i) + list.get(++i));

        }
        System.out.println(list);
        System.out.println(list.get(8) + " Девятое число Фибоначчи");

    }

}