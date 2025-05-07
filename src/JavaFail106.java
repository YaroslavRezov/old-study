public class JavaFail106 {
   static JavaFail98Super javaFail98Super = new JavaFail98Super();
    static JavaFail98Super javaFail98Super1 = new JavaFail98Super();

    public static void main(String[] args) {
        System.out.println(javaFail98Super.equals(javaFail98Super1));
    }
}
