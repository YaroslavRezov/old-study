public class LastJava18 {

    public static void printSum(int a, int b){
        System.out.println("In int "+(a+b));
    }

    public static void printSum(Integer a, Integer b){
        System.out.println("In Integer "+(a+b));
    }

    public static void printSum(double a, double b){
        System.out.println("In double "+(a+b));

    }
    public static void printSum(Double a, Double b){
        System.out.println("In double "+(a+b));
    }

    public static void main(String[] args) {
        Integer i = 1;
        Integer j = 2;
        printSum(i, j);

    }
}
