public class LastJAva5 {
    public static void main(String[] args) {
        String s = "shit";
        StringBuffer ss = new StringBuffer(s);
        ss.reverse();
        System.out.println(ss);
        s = ss.toString();
        System.out.println(s);
    }
}
