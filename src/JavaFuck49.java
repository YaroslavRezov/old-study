public class JavaFuck49 {


    public static void main(String[] args) {
//        int i = 42; works
//        long ln = 42;
        Integer i = new Integer(42);
        Long ln = new Long(42); // dorsnt
        double d = 42.0;
//        System.out.println(i == ln);
        Legend legend = new Legend() {
            @Override
            public void kill() {

            }

            @Override
            public void loot() {

            }
        };
    }
}
