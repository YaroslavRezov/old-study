public class JavaFail68 {
    static String[] s  = {"dick", null};
    static int g = 4;
    static TestAsh ash;
    static StringBuilder sb = new StringBuilder("shit");
    public JavaFail68() {
        System.out.println(g);
    }
    public static void main(String[] args) {
        addCock(s);
        System.out.println(s[0] + ", " + s[1]);
//        System.out.println(g);
//        System.out.println(angeStringBulder(sb)); even not doesnt work
        JavaFail68 javaFail68 = new JavaFail68();
        changeStringBulder(sb);
        System.out.println(sb);
        String s = "aSH";
        int i = s.length();
        int i1 = sb.length();
    }

    public static void addCock(String[] mass) {
        mass[1] = "cock";
    }
    public static void changeInt(int i){
        i = 5;
    }
    public static void changeStringBulder(StringBuilder stringBuilder) {
        stringBuilder.append("eat");
    }
    public static void changeAshTest(TestAsh testAsh) {};
}
