public class YesJava39 implements YesJava39Inter1, YesJava39Inter2{
    public void m1() { System.out.println("Hello"); }
    public static void main(String[] args){
        YesJava39 tc = new YesJava39();
       System.out.println(YesJava39Inter1.VALUE);
        tc.m1();
    }
}
