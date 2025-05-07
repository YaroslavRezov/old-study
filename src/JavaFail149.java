public class JavaFail149 {

    public static void main(String[] args) {
        JavaFail149Legend legend = new JavaFail149Legend();
        int i =5;
        loot(legend, i, 1);
        System.out.println(legend.gun);
        System.out.println(legend.ammo);
        System.out.println(i);

    }
    public static void loot(JavaFail149Legend legend, int i, Integer ammo) {
        legend.gun = "Wingman";
        i = 6;
        ammo = ammo;
    }
}
