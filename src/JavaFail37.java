public class JavaFail37 {
    static int x = 5;
    public static void main(String[] args){
        int x  = ( x=3 ) * 4;  // 1
        System.out.println(x);
    }
}
