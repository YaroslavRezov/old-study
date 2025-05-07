public class JavaFail80 {
    public static void main(String[] args) {
        doShit();
        System.out.println("cock");
    }
    public static void doShit()  {
        try {
            notShit();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("cock");
        if (true) {

        }
        JavaFail80 javaFail80 = new JavaFail80();
        System.out.println();
    }
    public static void notShit() throws Exception {
        throw new Exception();

    }
}
