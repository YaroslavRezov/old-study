public class YesJava26Test {
    public static void main(String[] args) {
        YesJava26Inter m = new YesJava26Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location);
    }
}
