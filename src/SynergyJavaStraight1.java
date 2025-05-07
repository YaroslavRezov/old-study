public class SynergyJavaStraight1 {
    static int start;
    static int end;
    public static void main(String[] args) {
        SynergyJavaStraight1 s = new SynergyJavaStraight1();
        s.drawLine(5, 8);
        if (start > end) {
            System.out.println("Прямая = " + (start - end) + " см");
        } else {
            System.out.println("Прямая = " + (end - start) + " см");
        }


    }
    public void drawLine(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
