import java.util.ArrayList;
import java.util.Collections;

public class ComparableDogs {
    public static void main(String[] args) {
        ArrayList<Dogies> dogsList = new ArrayList<Dogies>();
        ComparableDogs comparableDogs = new ComparableDogs();
        comparableDogs.getNames(dogsList);
        Collections.sort(dogsList);
        System.out.println(dogsList);
    }

    public void getNames (ArrayList<Dogies> dogsList) {
        ArrayList<Dogies> dogsList2 = new ArrayList<Dogies>();
        Dogies dog1 = new Dogies("c");
        Dogies dog2 = new Dogies("d");
        Dogies dog3 = new Dogies("a");
        dogsList2.add(dog1);
        dogsList2.add(dog2);
        dogsList2.add(dog3);
        for (int x = 0; x < dogsList2.size(); x++) {
            Dogies nameMass = dogsList2.get(x);
            dogsList.add(nameMass);
        }
    }
}
