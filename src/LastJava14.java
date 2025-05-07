public class LastJava14 {
    int i = 0;
    public static void main(String[] args) {
        LastJava14 lastJava14 = new LastJava14();
        lastJava14.plus(10);
        lastJava14.minus(5);
        System.out.println(lastJava14.i);

    }
    void plus(int i) {
        this.i = this.i + i;
    }
    void minus(int i){
        this.i = this.i - i;
    }

}
