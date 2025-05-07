import java.util.ArrayList;

public class TestLol1 {
    public static void main(String[] args) {
        TestLol1 testLol1 = new TestLol1();
        Ash ash = new Ash();
        testLol1.testLol1met(2, ash, 3);

    }
    public void testLol1met(int m, Object p, double d) {
        ArrayList<Object> cum = new ArrayList<>();
        cum.add(p);
        m++;
        d = d + 2.5;
        System.out.println(cum + " " + d + " " + m);
    }
}
