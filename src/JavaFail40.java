public class JavaFail40 {
    public static void main(String[] args) {
        System.out.println("12345".charAt(4));
        Short k = new Short((short) 9);
        System.out.println(k instanceof Short);
        int i =10;
//        System.out.println( i<20 ? out1() : out2() );
        int h = args.length;;
        System.out.println(h);

    }

    private static void out2() {
    }

    private static void out1() {
    }
}
