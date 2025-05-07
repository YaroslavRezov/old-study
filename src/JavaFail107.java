public class JavaFail107 {
    public static void main(String[] args) {
        JavaFail107 javaFail107 = new JavaFail107();
        javaFail107.toCock();
        System.out.println(javaFail107.hashCode());
        System.out.println(javaFail107.getClass());
    }
    void toCock(){
        System.out.println(this);
    }
//    Object
}
