public class JavaFail73Sub extends JavaFail73Super {

    public void doCock() throws ClassCastException  {
        System.out.println("cok");
        throw new ClassCastException();
    }

    public static void main(String[] args) {
       JavaFail73Super javaFail73Super =  new JavaFail73Sub();
        javaFail73Super.doCock();
        javaFail73Super.i = 10;
        String s = new String("1");
        String w = new String("1");
        boolean b =s.equals(w);
        System.out.println(b);
        Byte b1 = 1;
        Integer i =1;
//        System.out.println(b1 == i);
    }
}
