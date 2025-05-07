public class JavaFail9 {
    static int si = 10;
    static int g = 5;
    public static void main (String[] args){
        new JavaFail9();
    }
    public JavaFail9(){
        System.out.println(this);
    }
    public String toString(){
        return "TestClass.si = "+this.si;
    }
}
