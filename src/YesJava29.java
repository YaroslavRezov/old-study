public class YesJava29 {
    public static void main(String[] args) {
        System.out.println(new Boolean("true").equals(new Boolean(true)));
        System.out.println(Boolean.parseBoolean("true") == true);
        System.out.println(new Boolean("true").equals(Boolean.TRUE));
    }

}
