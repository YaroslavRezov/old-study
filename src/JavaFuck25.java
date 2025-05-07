public class JavaFuck25 {
    public static void printSum(int a, int b){
        System.out.println("In int "+(a+b));
    }

    public static void printSum(short a, short b){
        System.out.println("In Integer "+(a+b));
    }

    public static double printSum(double a, double b){
        System.out.println("In double "+(a+b));
        return a;
    }

    public static void main(String[] args) {
        printSum(1.0, 2);
    }
}
