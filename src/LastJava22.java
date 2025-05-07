public class LastJava22 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 3, 3, 3, 3 };
        System.out.println( a [ (a = b)[3] ] );
    }
}
