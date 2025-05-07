import java.util.ArrayList;

public class HeapDeath {
    public static void main(String[] args) {
        boolean isTure;
        isTure = true;
        String x = new String();
        x = "kek";
        ArrayList<Giby> cum = new ArrayList<>();
        HeapDeath heapDeath = new HeapDeath();
        heapDeath.create(isTure, cum, x);

    }
    public void create(boolean isTrue, ArrayList<Giby> cum, String x) {
        while (isTrue == true) {
            Giby giby = new Giby();
            cum.add(giby);
        }
    }
}
