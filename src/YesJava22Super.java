public class YesJava22Super {
   public int h = 4;
    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
    public Legend bamboozle() {
        Legend legend = new Legend() {
            @Override
            public void kill() {
            }

            @Override
            public void loot() {
            }
        };
        return legend;
    }
}
