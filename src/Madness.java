public class Madness{
    public static void main(String[] args) {
        Legends calm_revenant = new Legends();
        calm_revenant.calmness = 1;
        Legends angry_revenant = new Legends();
        angry_revenant.calmness = 30;
        Legends tilted_revenant = new Legends();
        tilted_revenant.calmness = 9999;

        calm_revenant.scream();

        angry_revenant.scream();

        tilted_revenant.scream();
    }
}
