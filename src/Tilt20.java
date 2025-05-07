public class Tilt20 {
    private int nuberBars;
    boolean call;
    public Tilt20() {
        this(2);
        call = false;
    }
    public Tilt20(int nuberBars) {
        this.nuberBars = nuberBars;
    }

    public static void main(String[] args) {
        Tilt20 tilt20 = new Tilt20();
        System.out.println(tilt20.nuberBars);
    }
}
