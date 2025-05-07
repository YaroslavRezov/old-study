public class JavaFuck37 {
    static int x = 5;

    public static void main(String[] args){
        int x  = ( x=3 ) * 4;  // 1
        System.out.println(x);
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 0, 1, 2, 3 };
        System.out.println( a [ (a = b)[3] ] );
    }
}
