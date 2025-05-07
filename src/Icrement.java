public class Icrement {
    int i;
    private int inc() {
        return i++;
    }

    public static void main(String[] args) {
        Icrement icrement = new Icrement();
        System.out.println(icrement.inc());
        System.out.println(icrement.inc());
    }
}
