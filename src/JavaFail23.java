public class JavaFail23 {
    public static void main(String[] args) {
        int[] a = { 6, 2, 3, 4 };
        int[] b = { 0, 1, 2, 3 };
        System.out.println( a [ (a = b)[0] ] );
    }
}
