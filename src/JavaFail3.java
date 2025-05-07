public class JavaFail3 {
    static short  cock = 2;
   static int dick = 3;
   static boolean what = dick > cock;

    public static void main(String[] args) {
        System.out.println(what);
        Legend legend = new Legend() {
            @Override
            public void kill() {

            }

            @Override
            public void loot() {

            }
        };
        Ash ash = new Ash();
        boolean b = ash instanceof Legend;
        System.out.println(b);
        System.out.println(ash.equals(legend));
    }
}
