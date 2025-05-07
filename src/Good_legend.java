class  Good_legend{
    private int calmness;
    public  int getCalmness() {
        return calmness;
    }
    public void setCalmness (int s) {
        calmness = s;
    }


    void scream () {
        if (calmness > 30) {
            System.out.println("AHHHHHHHHHHH, licrick pause... Yoo dont want to see this up close, skinbaaag");

        }
        else if (calmness > 10) {
            System.out.println("ahhhh");
        }
        else {
            System.out.println("blya");
        }
    }


}
class Good_legend_cock {
    public static void main(String[] args) {
        Good_legend calm_revenant = new Good_legend();
        calm_revenant.setCalmness(10);
        Good_legend angry_revenant = new Good_legend();
        angry_revenant.setCalmness(30);
        Good_legend tilted_revenant = new Good_legend();
        tilted_revenant.setCalmness(99999);

        System.out.println("Calm Reva "+ calm_revenant.getCalmness());
        System.out.println("Angry Reva "+ angry_revenant.getCalmness());
        System.out.println("Tilted Reva "+ tilted_revenant.getCalmness());
        calm_revenant.scream();
        angry_revenant.scream();
        tilted_revenant.scream();
    }
}
