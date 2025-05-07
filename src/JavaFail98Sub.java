public class JavaFail98Sub extends JavaFail98Super{
    public int h = 44;
    public int getH(){
        System.out.println("Sub "+h);
        return h;
    }
    public static void main(String[] args) {
        JavaFail98Super sub2 = new JavaFail98Sub();
        System.out.println(sub2.h+" "+sub2.getH());
        JavaFail98Sub sub1 = (JavaFail98Sub) sub2;
        System.out.println(sub1.h+" "+sub1.getH());
    }
}
