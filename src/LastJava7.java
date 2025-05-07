public class LastJava7 {
    public LastJava7(){
        s1 = sM1("1");
    }
    static String s1 = sM1("a");
    String s3 = sM1("2");{
        s1 = sM1("3");
    }
    static{
        s1 = sM1("b");
    }
    static String s2 = sM1("c");
    String s4 = sM1("4");
    public static void main(String args[]){
        LastJava7 it = new LastJava7();
    }
    private static String sM1(String s){
        System.out.println(s);  return s;
    }
//First, static statements/blocks are called IN THE ORDER they are defined.
//Next, instance initializer statements/blocks are called IN THE ORDER they are defined.
//Finally, the constructor is called. So, it prints a b c 2 3 4 1.
//
//
}
