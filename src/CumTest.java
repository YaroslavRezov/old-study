public class CumTest implements Cum {
    int arra[] = new int[200];
    int size = 0;

    @Override
    public int Get(int i) {
        return arra[i];
    }

    @Override
    public boolean Add(int val) {
        if (size != arra.length) {
            arra [size] = val;
            size++;
            return true;
        } else
            return false;
    }

    @Override
    public int cocker() {
        return 0;
    }
}