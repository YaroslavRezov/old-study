import java.util.LinkedList;
import java.util.Scanner;

public class SynergyJava19 {
    public static void main(String[] args) {
        SynergyJava19 synergyJava19 = new SynergyJava19();
        LinkedList<Integer> L1 = synergyJava19.putElements(3);
        LinkedList<Integer> L2 = synergyJava19.putElements(4);

        if (L2.containsAll(L1)) {
            System.out.println("Список L1 входит в список L2");
        } else {
            System.out.println("Список L1 не входит в список L2");
        }
    }
    LinkedList<Integer> putElements(int elements){
        LinkedList<Integer> theList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < elements; i++) {
            System.out.println("Введите число номер " + i);
            theList.add(sc.nextInt());
        }
        return theList;
    }
}
