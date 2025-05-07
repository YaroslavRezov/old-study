public class YesJava23 {
   static Integer i = new Integer(1);
   static Long l = new Long(1);
   static String s = new String("cock");
   static String ss = new String("cock");
   static String sss = "cock";
   static String ssss;

    public static void main(String[] args) {
//        System.out.println(i==l);
        System.out.println(s==ss);
        System.out.println(sss==ssss);
        System.out.println(s==ssss);
        System.out.println(s.equals(ss));
        System.out.println(s.equals(ssss));

    }
}

