public class JavaFail83 {
    static double rate = 10;
    static double amount = 1 - rate/100*1 - rate/100;

    public static void main(String[] args) {
        System.out.println(amount);
    }
}
