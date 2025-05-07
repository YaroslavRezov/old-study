import java.util.ArrayList;
import java.util.Arrays;

public class SynergyJavaSchool {
    String name;
    int[] mark;
    boolean isChecked;
    SynergyJavaSchool(String name, int[] mark) {
        this.name = name;
        this.mark = mark;
        isChecked = false;
    }
    public String getName() {
        return name;
    }
    public int[] getMark() {
        return mark;
    }
    public boolean getChecked() {
        return isChecked;
    }
    public void getEverythingand() {
        System.out.println(getName()+" "+ Arrays.toString(getMark()));

    }
    public static void main(String[] args) {
        SynergyJavaSchool student1 = new SynergyJavaSchool("Oleg", new int[]{3, 2, 4, 5 ,3});
        SynergyJavaSchool student2 = new SynergyJavaSchool("Fedr", new int[]{4, 4, 4, 5 ,3});
        SynergyJavaSchool student3 = new SynergyJavaSchool("Petr", new int[]{3, 2, 4, 4 ,3});
        SynergyJavaSchool student4 = new SynergyJavaSchool("Vano", new int[]{2, 5, 4, 3 ,3});
        ArrayList<SynergyJavaSchool> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        for (int i =0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).getMark().length; j++) {
                int ii [] = arrayList.get(i).getMark();
                if (ii[j] == 2) {
                    arrayList.get(i).isChecked = true;
                }

            }
        }
        for (int i =0; i < arrayList.size(); i++) {
            if(!arrayList.get(i).getChecked()) {
                arrayList.get(i).getEverythingand();
            }
        }



    }
}
