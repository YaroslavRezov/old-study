public  class JavaFail86 implements JavaFail86Inter1, JavaFail86Inter2{



    public void cock() {
             System.out.println();

         }

    @Override
    public void tosessh() {
        JavaFail86Inter1.super.tosessh();
    }

    public static void main(String[] args) {
       boolean b =JavaFail86Inter1.VAL == JavaFail86Inter2.VAL;
        System.out.println(b);
//        VAL =
    }
}
