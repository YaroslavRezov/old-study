import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableCats {
    public static void main(String[] args) {
        ArrayList<Cats> catsList = new ArrayList<Cats>();
        ComparableCats comparableCats = new ComparableCats();
        comparableCats.getNames(catsList);
        NameCompare nameCompare = new NameCompare();
        AgeCompare ageCompare = new AgeCompare();

        Collections.sort(catsList, nameCompare);
        System.out.println(catsList);
        Collections.sort(catsList, ageCompare);
        System.out.println(catsList);
    }

    public void getNames (ArrayList<Cats> catsList) {
        ArrayList<Cats> catsList2 = new ArrayList<Cats>();
        Cats cat1 = new Cats("c", 5);
        Cats cat2 = new Cats("g", 4);
        Cats cat3 = new Cats("a", 1);
        Cats cat4 = new Cats("cock", 12);
        catsList2.add(cat1);
        catsList2.add(cat2);
        catsList2.add(cat3);
        catsList2.add(cat4);
        for (int x = 0; x < catsList2.size(); x++) {
            Cats nameMass = catsList2.get(x);
            catsList.add(nameMass);
        }
    }
}
