public class JavaFuck16 {
    String a = "x";
    static char b = 'x';
    String  c = "x";
    class Inner{
        String  a = "y";
        String  get(){
            String c = "temp";
            c = JavaFuck16.this.a;
            return c;
        }
    }

    JavaFuck16() {
        System.out.println(  new Inner().get()  );
    }

    public static void main(String args[]) {  new JavaFuck16();  }
}
