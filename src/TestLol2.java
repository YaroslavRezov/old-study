public class TestLol2 {
    public int base;
    public int height;
    public double area = 0;
public TestLol2(int pBase, int pHeight) {
    this.base = pBase;
    this.height = pHeight;
    updateArea();
}
    public static void main(String[] args) {

    }
    public void updateArea() {
    double a = base*height/2;
    area = a;
    }
    public void setBase(int b) { base = b; updateArea();}
    public void setHeight(int h) { height = h; updateArea();}
}
