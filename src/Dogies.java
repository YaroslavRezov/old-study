public class Dogies implements Comparable<Dogies>{
    String name;
    Dogies(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public  String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Dogies d) {
        return name.compareTo(d.getName());
    }

}
