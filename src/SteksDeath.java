public class SteksDeath {
    int x = 0;
    public static void main(String[] args) {
        SteksDeath steksDeath = new SteksDeath();
        steksDeath.make();

    }
    public void make() {
        this.x = this.x + 1;
        System.out.println(this.x);
        make();
    }
}
