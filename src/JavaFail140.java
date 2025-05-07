public class JavaFail140 {
    public static void main(String[ ] args){
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 0, 1, 2, 3};
        System.out.println( a [ b[3] ] );
        System.out.println("cock".substring(0,4));
    }
}
