public class JavaFail141SuperRRRSub extends JavaFail141SuperRRR {
    void methodA(){
        System.out.println("sub - MethodA");
    }
   static void methodC(){
        System.out.println("sub - MethodA");
    }
    void methodB(){
        System.out.println("sub- MethodA");
    }
    public static void main(String args[]) {
        JavaFail141SuperRRR b = new JavaFail141SuperRRRSub(); //1
        b.methodA(); //wow, instance once stick to sub but only if this
        // method is in super, so it overrides
//        well static doesn't, it sticks to super if you call it like this
//        it never overrides but get hidden
        b.methodC();
    }
}
