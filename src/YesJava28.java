public class YesJava28 {
    public static void main(String[] args) {
        probe("man");
        probe(1);
        Ash ash = new Ash();
        probe(ash);
    }
    private static void probe(Object x) {
        System.out.println(x);
    }
}
