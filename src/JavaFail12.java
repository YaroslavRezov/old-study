public class JavaFail12 {
    static String s1 = sM1("a");
    {
        s1 = sM1("b");
    }
    static{
        s1 = sM1("c");
    }
    public static void main(String args[]){
        JavaFail12 it = new JavaFail12();
    }
    private static String sM1(String s){
        System.out.println(s);  return s;
    }
}
