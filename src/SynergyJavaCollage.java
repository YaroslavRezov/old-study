import java.util.ArrayList;
import java.util.Arrays;

public class SynergyJavaCollage {
    String name;
    int curse;
    SynergyJavaCollage(String name, int curse) {
        this.name = name;
        this.curse = curse;

    }
    public String getName() {
        return name;
    }
    public int getCurse() {
        return curse;
    }
    public void getEverything() {
        System.out.println(getName()+" "+ getCurse());

    }

    public static void main(String[] args) {
        SynergyJavaCollage student1 = new SynergyJavaCollage("Oleg", 1);
        SynergyJavaCollage student2 = new SynergyJavaCollage("Fedr", 2);
        SynergyJavaCollage student3 = new SynergyJavaCollage("Petr", 2);
        SynergyJavaCollage student4 = new SynergyJavaCollage("Vano", 4);
        ArrayList<SynergyJavaCollage> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        for (int i =0; i < arrayList.size(); i++) {
            if(arrayList.get(i).curse == 2) {
                arrayList.get(i).getEverything();
            }
        }

    }

}
