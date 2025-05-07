import java.util.Comparator;

public class AgeCompare implements Comparator<Cats> {
    @Override
    public int compare(Cats cat1, Cats cat2) {
        return cat1.age - cat2.age;
    }
}
