import java.util.ArrayList;

public class SynergyJava13 {
    ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int i;
        SynergyJava13 synergyJava13 = new SynergyJava13();
        i = synergyJava13.bruh(9);
        synergyJava13.list.add(i);
        System.out.println(synergyJava13.list);
        int sum = 0;
        for (int j = 0; j < synergyJava13.list.size();j++) {
            sum = sum + synergyJava13.list.get(j);
        }
        System.out.println(sum);
//        int stars = synergyJava13.list.size();
//        System.out.println(" Всего звёзд " + stars);

    }
    public int bruh(int i){

        if(i > 0) {
            list.add(bruh(i - 4));
            list.add(bruh(i / 2));

        }
        System.out.println(i);
//        System.out.print("* ");

        return i;
    }
}
