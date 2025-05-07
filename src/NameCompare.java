import java.util.Comparator;

public class NameCompare implements Comparator<Cats> {
    @Override
    public int compare(Cats cat1, Cats cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }
}

