public class Tilt15 {
    public void print(byte x) {
        System.out.println("byte");
    }
    public void print(int x) {
        System.out.println("int");
    }
    public void print(float x) {
        System.out.println("float");
    }
    public void print(Object x) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        Tilt15 tilt15 = new Tilt15();
        short s = 123;
        tilt15.print(s);
        tilt15.print(true);
        tilt15.print(6.789);
    }
}
