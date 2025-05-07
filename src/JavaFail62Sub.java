public class JavaFail62Sub extends JavaFail62SuperSub {
    public void cock(String s) {
        System.out.println(s + "IN sub");
        super.cock("");
    }
    public void dick() {

    }

    public static void main(String[] args) {
        JavaFail62Sub javaFail62Sub = new JavaFail62Sub();
        javaFail62Sub.cock("s");
        JavaFail62Super javaFail62Super = new JavaFail62Sub();
//        javaFail62Super.dick();

//        int i = 1 / 0;
//        System.out.println(i);

    }
}
