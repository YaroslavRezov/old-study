public class YesJava22Sub extends YesJava22Super{
   public int h = 44;

//    public int getH() {
//        System.out.println("Beta " + h);
//        return h;
//
//    }

    @Override
    public Legend bamboozle() {
        Ash ash = new Ash();
        return ash;
    }

    public static void main(String[] args) {
        YesJava22Super b = new YesJava22Sub();
            System.out.println(b.getH() + " " + b.h);

//        YesJava22Sub bb = (YesJava22Sub) b;
//        System.out.println(bb.h + " " + bb.getH());

            b.bamboozle();
    }
}
