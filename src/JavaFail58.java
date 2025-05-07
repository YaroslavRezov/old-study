public class JavaFail58 {
    public void method(Object o){
        System.out.println("Object Version");
    }
    public void method(String s){
        System.out.println("String Version");
    }
    public void method(StringBuilder s){
        System.out.println("StringBuffer Version");
    }
    public static void main(String args[]){
        JavaFail58 tc = new JavaFail58();
//        tc.method(null); buffer bilder has same trend as string
    }
}
