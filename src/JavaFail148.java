public class JavaFail148 {

    String global = "111";

    public int parse(String arg) {
        int value = 0;
        try {
            global = arg;
            value = Integer.parseInt(global);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        System.out.print(global + " " + value + " ");
        return value;
    }

    public static void d(Long l) {

    }
    int j;

    public static void main(String[] args) {
        JavaFail148 ct = new JavaFail148();
        System.out.print(ct.parse("333"));
        Long l = 100000000L;
        Long k = new Long(1000l);
//        Object c, d = new Object();
//        System.out.println(c);
        int i = 5;
        ct.getObject(i);
        int j = 6;
    }
    public Object getObject(Object a) {
        Object b = new Object();  //XXX
        Object c, d = new Object(); //1
        c = b; //2
        b = a = null; //3
        System.out.println(b);
        return c; //4
    }

}
